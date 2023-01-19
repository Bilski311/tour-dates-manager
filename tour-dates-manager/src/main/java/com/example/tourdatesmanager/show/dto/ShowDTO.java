package com.example.tourdatesmanager.show.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.tourdatesmanager.show.entity.Show;

import lombok.Data;

@Data
public class ShowDTO {
    private Long id;

    private String city;

    private String venue;

    private LocalDate showDate;

    private LocalTime showTime;

    private Double ticketPrice;

    public ShowDTO(Show show) {
        this.id = show.getId();
        this.city = show.getCity();
        this.venue = show.getVenue();
        this.showDate = show.getShowDate();
        this.showTime = show.getShowTime();
        this.ticketPrice = show.getTicketPrice();
    }
}