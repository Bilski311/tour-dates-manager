package com.example.showservice.show.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.showservice.show.entity.Show;

import lombok.Data;

@Data
public class ShowDTO {
    private String city;

    private String venue;

    private LocalDate showDate;

    private LocalTime showTime;

    public ShowDTO(Show show) {
        this.city = show.getCity();
        this.venue = show.getVenue();
        this.showDate = show.getShowDate();
        this.showTime = show.getShowTime();
    }
}