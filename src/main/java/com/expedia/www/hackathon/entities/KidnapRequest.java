package com.expedia.www.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KidnapRequest implements Request {

    private final String date;
    private final String budget;
    private final String nPeople;
    private final String origin;

    @JsonCreator
    public KidnapRequest(@JsonProperty("date") String date, @JsonProperty("budget") String budget, @JsonProperty("npeople") String nPeople, @JsonProperty("origin") String origin) {
        this.date = date;
        this.budget = budget;
        this.nPeople = nPeople;
        this.origin = origin;
    }

    public String getDate() {
        return date;
    }

    public String getBudget() {
        return budget;
    }

    public String getnPeople() {
        return nPeople;
    }

    public String getOrigin() {
        return origin;
    }
}
