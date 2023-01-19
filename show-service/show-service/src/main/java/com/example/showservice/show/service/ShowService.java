package com.example.showservice.show.service;

import org.springframework.stereotype.Service;

import com.example.showservice.show.dto.CreateShowRequest;
import com.example.showservice.show.entity.Show;
import com.example.showservice.show.repository.ShowRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;

    public void createShow(CreateShowRequest request) {
        System.out.println("Creating show.");
        Show show = createShowEntityFromRequest(request);
        showRepository.save(show);
    }

    private Show createShowEntityFromRequest(CreateShowRequest request) {
        Show show = new Show();
        show.setCity(request.getCity());
        show.setVenue(request.getVenue());
        show.setShowDate(request.getShowDate());
        show.setShowTime(request.getShowTime());
        show.setTicketPrice(request.getTicketPrice());

        return show;
    }
}