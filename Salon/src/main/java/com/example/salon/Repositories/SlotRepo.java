package com.example.salon.Repositories;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Entities.Slot;
import com.example.salon.Entities.SlotStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SlotRepo extends JpaRepository<Slot, Long> {

    List<Slot> findAllBySlotForGreaterThanEqualAndSlotForLessThanEqualAndAvailableServicesContainingAndStatus(LocalDateTime startTime, LocalDateTime endTime, SalonServiceDetail serviceDetail, SlotStatus status);
}
