package com.sumone.drink.controller;

import com.sumone.drink.commons.RecommendationRequest;
import com.sumone.drink.entity.Drink;
import com.sumone.drink.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "drinks", produces = MediaType.APPLICATION_JSON_VALUE)
public class DrinkController {

    @Autowired
    private DrinkService service;

    @GetMapping
    public ResponseEntity<List<Drink>> find() {
        List<Drink> all = service.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> save(@RequestBody Drink drink) {
        Long saved = service.save(drink);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PostMapping(path = "recommendation", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Drink>> recommendation(@RequestBody RecommendationRequest request) {
        List<Drink> drinks = service.recommendation(request);
        return ResponseEntity.ok(drinks);
    }
}
