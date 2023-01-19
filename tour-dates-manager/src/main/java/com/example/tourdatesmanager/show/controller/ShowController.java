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
import com.example.tourdatesmanager.show.dto.CreateShowRequest;
import com.example.tourdatesmanager.show.dto.ShowDTO;
import com.example.tourdatesmanager.show.service.ShowService;

import lombok.RequiredArgsConstructor;

@RestController()
@RequestMapping("/show")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
class ShowController {

    private final ShowService showService;

    private final QueueSender queueSender;

    @PostMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> create(@RequestBody CreateShowRequest request) {
        System.out.println(request);
        queueSender.send(request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        this.showService.deleteShow(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<ShowDTO>> getAll() {
        List<ShowDTO> shows = this.showService.getAll();

        return ResponseEntity.ok(shows);
    }
}