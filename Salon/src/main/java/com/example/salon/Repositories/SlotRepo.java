package com.example.salon.Repositories;

import com.example.salon.Entities.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepo extends JpaRepository<Slot, Long> {

}
