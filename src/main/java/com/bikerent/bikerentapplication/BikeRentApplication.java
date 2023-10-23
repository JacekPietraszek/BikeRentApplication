package com.bikerent.bikerentapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BikeRentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BikeRentApplication.class, args);
        BikeDto bike1 = new BikeDto(1L, "Kross Esker 4.0", "KRS12345", 30, 100);
        BikeService bikeService = context.getBean(BikeService.class);
        bikeService.add(bike1);
        double payment = bikeService.rentForHours("KRS12345", 5, "DAL123");
        System.out.println(payment);
        bikeService.returnBike("KRS12345");
    }

}
