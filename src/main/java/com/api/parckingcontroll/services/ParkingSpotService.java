package com.api.parckingcontroll.services;

import org.springframework.stereotype.Service;

import com.api.parckingcontroll.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

  final ParkingSpotRepository parkingSpotRepository;

  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    this.parkingSpotRepository = parkingSpotRepository;
  }
}
