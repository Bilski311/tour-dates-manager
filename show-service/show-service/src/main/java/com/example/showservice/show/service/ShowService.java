package com.example.showservice.show.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.showservice.show.dto.CreateShowRequest;
import com.example.showservice.show.dto.ShowDTO;
import com.example.showservice.show.repository.ShowRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;

    public void createShow(CreateShowRequest request) {
        System.out.println("Creating show.");
        // Show show = createShowEntityFromRequest(request);

        // showRepository.save(show);
    }
}