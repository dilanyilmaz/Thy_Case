package com.thy.airport.controller;

import com.thy.airport.dto.AirportDTO;
import com.thy.airport.dto.PredictiveInfos.Airports;
import com.thy.airport.dto.core.ResponsePayload;
import com.thy.airport.repository.AirportRepository;
import com.thy.airport.service.AirportService;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airport")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AirportController {
  private final AirportService airportService;
  private final AirportRepository airportRepository;
  @GetMapping(value = "/listAirports")
  public ResponsePayload<List<AirportDTO>> listAirports(){
    return airportService.list();
  }

  @GetMapping(value = "/listAirportsByCountry")
  public ResponsePayload<List<Airports>> listAirportsByCountry(@RequestParam("id") Long id){
    return airportService.listA(id);
  }
}
