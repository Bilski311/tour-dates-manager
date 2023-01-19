package com.example.tourdatesmanager.show.dto;

import com.example.tourdatesmanager.show.entity.City;
import com.example.tourdatesmanager.show.entity.CityJpaEntity;

import lombok.Data;

@Data
public class CityDTO {
    private String name;

    public CityDTO(String name) {
        this.name = name;
    }

    public CityDTO(CityJpaEntity city) {
        this.name = city.getName();
    }
}