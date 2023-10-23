package com.bikerent.bikerentapplication;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


interface BikeRepository extends CrudRepository<Bike, Long> {
    Optional<Bike> findBySerialNoIgnoreCase(String serialNo);
    int countBikeByBorrowerIdIsNotNull();
    List<Bike> findAllByBorrowerIdIsNullOrderByDayPrice();
}
