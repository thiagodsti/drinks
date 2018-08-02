package com.sumone.drink.service;

import com.sumone.drink.commons.RecommendationRequest;
import com.sumone.drink.entity.Drink;
import com.sumone.drink.repository.DrinkRepository;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {

    @Autowired
    private DrinkRepository repository;

    @Override
    public List<Drink> findAll() {
        return repository.findAll();
    }

    @Override
    public Long save(Drink drink) {
        return repository.save(drink).getId();
    }

    @Override
    public List<Drink> recommendation(RecommendationRequest request) {
        throw new NotYetImplementedException("You must implement it");
    }
}
