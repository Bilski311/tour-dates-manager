package com.example.tourdatesmanager.show.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tourdatesmanager.show.entity.CityJpaEntity;



public interface CityJpaRepository extends JpaRepository<CityJpaEntity, Long> {
}