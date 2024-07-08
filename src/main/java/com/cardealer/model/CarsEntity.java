package com.cardealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cars")
@Builder
public class CarsEntity {

    @Id
    private String id;

    private String brand;
    private int quantity;
    private String model;
    private boolean active;
}
