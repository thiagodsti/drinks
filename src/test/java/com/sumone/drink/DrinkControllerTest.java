package com.sumone.drink;

import com.sumone.drink.entity.Drink;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class DrinkControllerTest extends ApplicationTests {

    private int cont = 0;

    @Test
    public void save() {
        ResponseEntity<Long> response = restTemplate.postForEntity("/drinks", buildDrink(), Long.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.CREATED));
        assertThat(response.getBody(), greaterThan(0l));
    }

    @Test
    public void listAll() {
        this.save();
        ResponseEntity<Drink[]> response = restTemplate.getForEntity("/drinks", Drink[].class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
        assertThat(response.getBody().length, greaterThan(0));
    }

    private Drink buildDrink() {
        Drink drink = new Drink();
        drink.setAlcoholLevel(1);
        drink.setBaseIngredient("Vodka");
        drink.setName("Test" + cont++);
        drink.setDescription("Tests" + cont++);
        return drink;
    }
}
