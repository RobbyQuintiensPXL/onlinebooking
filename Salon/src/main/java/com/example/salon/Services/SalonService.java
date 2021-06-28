package com.example.salon.Services;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Repositories.SalonServiceDetailRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {

    SalonServiceDetailRepo salonServiceDetailRepository;


    public SalonService(SalonServiceDetailRepo salonServiceDetailRepository) {
        this.salonServiceDetailRepository = salonServiceDetailRepository;
    }


    public List<SalonServiceDetail> findAll() {
        return salonServiceDetailRepository.findAll();
    }
}
