package com.example.salon.Services;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Entities.Slot;
import com.example.salon.Entities.SlotStatus;
import com.example.salon.Repositories.SlotRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class SlotService {

    private final SlotRepo slotRepo;
    private final SalonService salonService;

    public SlotService(SlotRepo slotRepo, SalonService salonService){
        this.slotRepo = slotRepo;
        this.salonService = salonService;
    }

    public List<Slot> getSlotsForServiceOnDate(Long slotServiceId, String formattedDate) {
        SalonServiceDetail salonServiceDetail = salonService.findById(slotServiceId).orElseThrow(() -> new RuntimeException("Service not found!"));

        LocalDate localDate = getAsDate(formattedDate);

        LocalDateTime startDate = localDate.atTime(0, 1);
        LocalDateTime endDate = localDate.atTime(23, 59);

        return slotRepo.findAllBySlotForGreaterThanEqualAndSlotForLessThanEqualAndAvailableServicesContainingAndStatus(startDate, endDate, salonServiceDetail, SlotStatus.AVAILABLE);
    }

    public LocalDate getAsDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }
}
