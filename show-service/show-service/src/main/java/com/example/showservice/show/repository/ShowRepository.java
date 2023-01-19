package com.example.showservice.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.showservice.show.entity.Show;


public interface ShowRepository extends JpaRepository<Show, Long> {
}