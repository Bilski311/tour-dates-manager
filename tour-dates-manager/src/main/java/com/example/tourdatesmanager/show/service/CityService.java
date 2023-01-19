package com.example.tourdatesmanager.show.service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.tourdatesmanager.show.dto.CityDTO;
import com.example.tourdatesmanager.show.dto.ShowDTO;
import com.example.tourdatesmanager.show.entity.City;
import com.example.tourdatesmanager.show.repository.CityJpaRepository;
import com.example.tourdatesmanager.show.repository.CityRepository;
import com.example.tourdatesmanager.show.repository.ShowRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityJpaRepository cityJpaRepository;

    private final CityRepository cityRepository;

    public List<CityDTO> getAll() {
        List<CityDTO> cachedCities = List.of();
        try {
            cityRepository.findAll().forEach(city -> cachedCities.add(new CityDTO(city)));
        } catch (Exception e) {
            System.out.println(e);
        }

        if (cachedCities.isEmpty()) {
            System.out.println("No cached cities");
            List<CityDTO> cities = cityJpaRepository.findAll()
                    .stream()
                    .map(city -> new CityDTO(city))
                    .collect(Collectors.toList());
            
            return cities;
        }

        return cachedCities;

    }
}