package com.sumone.drink.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column(columnDefinition = "TEXT")
    @NotNull
    private String description;

    @Column
    private String imageUrl;

    @Column
    private Date createdAt;

    @Column
    private Date updatedAt;

    @Column
    @Min(0)
    @Max(100)
    private Integer alcoholLevel;

    @Column
    private boolean distilled;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private TemperatureEnum temperature;

    @Column
    private String baseIngredient;

    @Column
    private String origin;

    @Column
    @Min(0)
    @Max(10)
    private Integer ibu;

    @Column
    private String drinkware;

    @Column
    @Min(0)
    @Max(5)
    private Double ratingAvg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getAlcoholLevel() {
        return alcoholLevel;
    }

    public void setAlcoholLevel(Integer alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    }

    public boolean isDistilled() {
        return distilled;
    }

    public void setDistilled(boolean distilled) {
        this.distilled = distilled;
    }

    public TemperatureEnum getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureEnum temperature) {
        this.temperature = temperature;
    }

    public String getBaseIngredient() {
        return baseIngredient;
    }

    public void setBaseIngredient(String baseIngredient) {
        this.baseIngredient = baseIngredient;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    public String getDrinkware() {
        return drinkware;
    }

    public void setDrinkware(String drinkware) {
        this.drinkware = drinkware;
    }

    public Double getRatingAvg() {
        return ratingAvg;
    }

    public void setRatingAvg(Double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Drink drink = (Drink) o;
        return Objects.equals(id, drink.id) &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}