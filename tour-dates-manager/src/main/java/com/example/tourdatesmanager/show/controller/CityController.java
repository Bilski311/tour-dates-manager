package com.example.tourdatesmanager.show.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tourdatesmanager.rabbit.QueueSender;
import com.example.tourdatesmanager.show.dto.CityDTO;
import com.example.tourdatesmanager.show.dto.CreateShowRequest;
import com.example.tourdatesmanager.show.dto.ShowDTO;
import com.example.tourdatesmanager.show.service.CityService;
import com.example.tourdatesmanager.show.service.ShowService;

import lombok.RequiredArgsConstructor;

@RestController()
@RequestMapping("/city")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
class CityController {

    private final CityService cityService;

    @GetMapping("/all")
    public ResponseEntity<List<CityDTO>> getAll() {
        List<CityDTO> shows = this.cityService.getAll();

        return ResponseEntity.ok(shows);
    }
}