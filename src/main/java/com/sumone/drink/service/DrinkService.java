package com.sumone.drink.service;

import com.sumone.drink.commons.RecommendationRequest;
import com.sumone.drink.entity.Drink;

import java.util.List;

public interface DrinkService {

    List<Drink> findAll();

    Long save(Drink drink);

    List<Drink> recommendation(RecommendationRequest request);
}
