package com.example.tourdatesmanager.show.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.tourdatesmanager.show.dto.ShowDTO;
import com.example.tourdatesmanager.show.repository.ShowRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;

    public List<ShowDTO> getAll() {
        List<ShowDTO> shows = showRepository.findAll()
                .stream()
                .map(show -> new ShowDTO(show))
                .collect(Collectors.toList());
        return shows;
    }

    public void deleteShow(Long id) {
        this.showRepository.delete(this.showRepository.findById(id).get());
    }
}