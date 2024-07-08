package com.cardealer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarsDto {
    @NotBlank
    @NotEmpty
    @Size(min = 5 ,max = 12 ,message = "Should be at least 5 or lesser than 12 characters")
    private String brand;
    @Positive(message = "Quantity must be greater than 0")
    private int quantity;
    @NotBlank
    @NotEmpty
    @Size(min = 5 ,max = 12 ,message = "Should be at least 5 or lesser than 12 characters")
    private String model;

    private boolean active;
}
