package com.example.salon.Controllers;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Repositories.SalonServiceDetailRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/services/")
public class SalonServices {

    private SalonServiceDetailRepo salonRepo;

    public SalonServices(SalonServiceDetailRepo salonRepo){
        this.salonRepo = salonRepo;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    @ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
    public List<SalonServiceDetail> retrieveAvailableSalonServicesAPI(){
        return salonRepo.findAll();
    }
}
