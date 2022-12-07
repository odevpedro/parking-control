package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {


    //declarando metodo
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber (String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);



}
