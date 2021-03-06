package com.example.salon.Controllers;

import com.example.salon.Entities.Slot;
import com.example.salon.Services.SlotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/slots")
@CrossOrigin(origins = "http://localhost:3000")
@Api(value = "Slot", tags = {"Slot"})
public class SlotController {

    SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }

    @GetMapping("/retrieveAvailableSlots/{salonServiceId}/{formattedDate}")
    @ApiOperation(value = "RetrieveAvailableSlotsAPI")
    public List<Slot> retrieveAvailableSlotsAPI(@PathVariable Long salonServiceId, @ApiParam(value = "Date in yyyy-MM-dd format", required = true, defaultValue = "2020-11-21") @PathVariable String formattedDate) {
        return slotService.getSlotsForServiceOnDate(salonServiceId, formattedDate);
    }


}
