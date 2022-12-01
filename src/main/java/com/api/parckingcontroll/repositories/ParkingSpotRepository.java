package com.api.parckingcontroll.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parckingcontroll.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
