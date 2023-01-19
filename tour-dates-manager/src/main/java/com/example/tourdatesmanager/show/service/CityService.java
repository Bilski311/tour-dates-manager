package com.example.tourdatesmanager.show.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.tourdatesmanager.show.dto.CityDTO;
import com.example.tourdatesmanager.show.dto.ShowDTO;
import com.example.tourdatesmanager.show.entity.City;
import com.example.tourdatesmanager.show.entity.CityJpaEntity;
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
        List<CityDTO> cachedCities = new ArrayList<>();
        try {
            cityRepository.findAll().forEach(city -> cachedCities.add(new CityDTO(city.getName())));
        } catch (Exception e) {
            System.out.println("Exception while getting cache.");
            System.out.println(e);
        }

        if (cachedCities.isEmpty()) {
            System.out.println("No cached cities");
            List<CityJpaEntity> cities = cityJpaRepository.findAll();
            List<City> redisCities = cities.stream().map(jpaCity -> {
                City city = new City();
                city.setId(jpaCity.getId());
                city.setName(jpaCity.getName());
                return city;
            }).collect(Collectors.toList());
            cityRepository.saveAll(redisCities);
            return redisCities.stream().map(redisCity -> new CityDTO(redisCity.getName())).collect(Collectors.toList());
        }
        System.out.println("Returning cached cities");

        return cachedCities;
    }
}