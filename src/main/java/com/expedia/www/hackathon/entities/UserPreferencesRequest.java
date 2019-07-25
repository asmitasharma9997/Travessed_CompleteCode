package com.expedia.www.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPreferencesRequest implements Request {

    private final String travelStyle;
    private final String seasons;
    private final String budget;
    private final Integer history;
    private final Integer relaxation;
    private final Integer nature;
    private final Integer shopping;
    private final Integer food;
    private final Integer npeople;

    @JsonCreator
    public UserPreferencesRequest(@JsonProperty("travelStyle") String travelStyle, @JsonProperty("seasons") String seasons, @JsonProperty("budget") String budget, @JsonProperty("history") Integer history, @JsonProperty("relaxation") Integer relaxation, @JsonProperty("nature") Integer nature, @JsonProperty("shopping") Integer shopping, @JsonProperty("food") Integer food, @JsonProperty("npeople") Integer npeople) {
        this.travelStyle = travelStyle;
        this.seasons = seasons;
        this.budget = budget;
        this.history = history;
        this.relaxation = relaxation;
        this.nature = nature;
        this.shopping = shopping;
        this.food = food;
        this.npeople = npeople;
    }

    public String getTravelStyle() {
        return travelStyle;
    }

    public String getSeasons() {
        return seasons;
    }

    public String getBudget() {
        return budget;
    }

    public Integer getHistory() {
        return history;
    }

    public Integer getRelaxation() {
        return relaxation;
    }

    public Integer getNature() {
        return nature;
    }

    public Integer getShopping() {
        return shopping;
    }

    public Integer getFood() {
        return food;
    }

    public Integer getNpeople() {
        return npeople;
    }

}
