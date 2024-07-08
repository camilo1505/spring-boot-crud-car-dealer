package com.cardealer.controller.v1;

import com.cardealer.dto.CarsDto;
import com.cardealer.model.CarsEntity;
import com.cardealer.service.ICarsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/cars")
public class CarsController {

    private final ICarsService iCarsService;

    @PostMapping
    public ResponseEntity<CarsEntity> create(@RequestBody @Valid CarsDto carsDto){
        return iCarsService.save(carsDto);
    }

}
