package com.thy.airport.controller;

import com.thy.airport.dto.CountryDTO;
import com.thy.airport.dto.PredictiveInfos.Airports;
import com.thy.airport.dto.core.ResponsePayload;
import com.thy.airport.entity.Airport;
import com.thy.airport.service.CountryService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country")
@CrossOrigin(origins = "*",allowedHeaders = "*", maxAge = 3600)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {
  private final CountryService countryService;
  @GetMapping("/country")
  @RolesAllowed("user")
  public ResponsePayload<List<CountryDTO>> listCountry(){
    return countryService.list();
  }

}
