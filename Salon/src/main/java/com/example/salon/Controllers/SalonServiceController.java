package com.example.salon.Controllers;

import com.example.salon.Entities.SalonServiceDetail;
import com.example.salon.Entities.Slot;
import com.example.salon.Repositories.SalonServiceDetailRepo;
import com.example.salon.Repositories.SlotRepo;
import com.example.salon.Services.SalonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/services/")
public class SalonServiceController {

    private final SalonService salonService;

    public SalonServiceController(SalonService salonService){
        this.salonService = salonService;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    @ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
    public List<SalonServiceDetail> retrieveAvailableSalonServicesAPI(){
        return salonService.findAll();
    }


}
