package com.example.tourdatesmanager.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tourdatesmanager.show.entity.Show;


public interface ShowRepository extends JpaRepository<Show, Long> {
}