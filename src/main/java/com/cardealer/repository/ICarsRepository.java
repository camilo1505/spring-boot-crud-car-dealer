package com.cardealer.repository;

import com.cardealer.model.CarsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ICarsRepository extends JpaRepository<CarsEntity, String> {

    Optional<List<CarsEntity>> findByActiveTrue();

}
