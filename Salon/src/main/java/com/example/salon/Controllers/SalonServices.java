package com.example.salon.Controllers;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Repositories.SalonServiceDetailRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/services/", produces = "application/json")
public class SalonServices {

    private SalonServiceDetailRepo salonRepo;

    public SalonServices(SalonServiceDetailRepo salonRepo){
        this.salonRepo = salonRepo;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    public List<SalonServiceDetail> availableSalonServices(){
        return salonRepo.findAll();
    }
}
