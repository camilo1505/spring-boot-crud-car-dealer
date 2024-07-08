package com.cardealer.repository;

import com.cardealer.model.CarsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarsRepository extends JpaRepository<CarsEntity, String> {


}
