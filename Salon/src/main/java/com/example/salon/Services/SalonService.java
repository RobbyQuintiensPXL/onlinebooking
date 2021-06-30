package com.example.salon.Services;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Entities.Slot;
import com.example.salon.Repositories.SalonServiceDetailRepo;
import com.example.salon.Repositories.SlotRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class SalonService {

    private final SalonServiceDetailRepo salonServiceDetailRepository;


    public SalonService(SalonServiceDetailRepo salonServiceDetailRepository) {
        this.salonServiceDetailRepository = salonServiceDetailRepository;
    }

    public List<SalonServiceDetail> findAll() {
        return salonServiceDetailRepository.findAll();
    }

    public Optional<SalonServiceDetail> findById(Long id){
        return salonServiceDetailRepository.findById(id);
    }
}
