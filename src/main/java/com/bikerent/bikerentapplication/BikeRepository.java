package com.bikerent.bikerentapplication;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class BikeRepository {
    private final EntityManager entityManager;

    //dependency injection constructor
    public BikeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //saves bike in database
    @Transactional
    public void save(Bike bike) {
        entityManager.persist(bike);
    }

    public Optional<Bike> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Bike.class, id));
    }

    @Transactional
    public void deleteById(Long id) {
        findById(id).ifPresent(entityManager::remove);
    }
}
