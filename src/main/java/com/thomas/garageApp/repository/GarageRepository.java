package com.thomas.garageApp.repository;

import com.thomas.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {
}
