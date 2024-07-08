# Spring Boot Mini Project - Car Dealer REST Services

This is a practical example on how to build an easy and simple microservice. The project provides RESTful services to manage a car dealership. 

## Features

1. **Save Cars**: Allows users to save cars. Each car must have:
   - Car brand
   - Quantity
   - Model
   - ID
   - A property to indicate if it is active in the database

2. **Get List of Cars**: Allows users to obtain a list of cars.

## Endpoints

### Save Car
- **URL**: `/cars`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "brand": "string",
        "quantity": "integer",
        "model": "string",
        "active": "boolean"
    }
    ```

### Get List of Cars
- **URL**: `/cars`
- **Method**: `GET`
- **Response**:
    ```json
    [
        {
            "brand": "string",
            "quantity": "integer",
            "model": "string",
            "id": "UUID",
            "active": "boolean"
        }
    ]
    ```

## Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

- Java 17 or higher
- Gradle

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/camilo1505/spring-boot-crud-car-dealer.git
