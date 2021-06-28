package com.example.salon.Repositories;

import com.example.salon.Entities.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalonServiceDetailRepo extends JpaRepository<SalonServiceDetail, Long> {
    List<SalonServiceDetail> findAll();
}
