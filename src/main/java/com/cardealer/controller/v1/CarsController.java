package com.cardealer.controller.v1;

import com.cardealer.dto.CarsDto;
import com.cardealer.model.CarsEntity;
import com.cardealer.service.ICarsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/cars")
public class CarsController {

    private final ICarsService iCarsService;

    @PostMapping
    public ResponseEntity<CarsEntity> create(@RequestBody @Valid CarsDto carsDto){
        return iCarsService.save(carsDto);
    }

    @GetMapping
    public ResponseEntity<List<CarsEntity>> getCars() { return iCarsService.getAllCars(); }

}
