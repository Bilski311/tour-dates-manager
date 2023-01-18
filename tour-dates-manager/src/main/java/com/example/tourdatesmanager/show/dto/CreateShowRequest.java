package com.example.tourdatesmanager.show.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class CreateShowRequest implements Serializable {
    private String city;

    private String venue;

    private LocalDate showDate;

    private LocalTime showTime;

    private Double ticketPrice;
}