package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	boolean existByLicencePlateCar(String LicencePlateCar);

	boolean existByParkingSpotNumber(String ParkingSpotNumber);
	
	boolean existByApartmentAndBlock(String apartmentAndBlock);

}
