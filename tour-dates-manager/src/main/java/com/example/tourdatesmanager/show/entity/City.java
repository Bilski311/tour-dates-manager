package com.example.tourdatesmanager.show.entity;

import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@RedisHash("City")
@Getter
@Setter
public class City {
    private Long id;

    @Column(name = "name")
    private String name;
}
