package com.example.showservice.show.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class CreateShowRequest {
    private String city;

    private String venue;

    private LocalDate showDate;

    private LocalTime showTime;

    private Double ticketPrice;
}