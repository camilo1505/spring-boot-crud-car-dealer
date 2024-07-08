package com.cardealer.service;

import com.cardealer.dto.CarsDto;
import com.cardealer.model.CarsEntity;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface ICarsService {

    ResponseEntity<CarsEntity> save(CarsDto carsDto);

    ResponseEntity<ArrayList<CarsEntity>> getAllCars();
}
