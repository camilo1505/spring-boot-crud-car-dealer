package com.cardealer.service.impl;

import com.cardealer.dto.CarsDto;
import com.cardealer.model.CarsEntity;
import com.cardealer.repository.ICarsRepository;
import com.cardealer.service.ICarsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarsServiceImpl implements ICarsService {

    private final ICarsRepository carsRepository;

    @Override
    public ResponseEntity<CarsEntity> save(CarsDto carsDto) {

        String uuid = UUID.randomUUID().toString();

        CarsEntity cars = CarsEntity
                .builder()
                .id(uuid)
                .brand(carsDto.getBrand())
                .active(true)
                .quantity(carsDto.getQuantity())
                .model(carsDto.getModel())
                .build();
        var newCars =  this.carsRepository.save(cars);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newCars);
    }

    @Override
    public ResponseEntity<ArrayList<CarsEntity>> getAllCars() {
        return null;
    }
}
