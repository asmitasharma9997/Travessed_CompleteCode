package com.expedia.www.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class KidnapResponse {

    String weatherForecast;
    String essentials;
    String boardingLocation;
    String boardingTime;

    public void setWeatherForecast(String weatherForecast) {
        this.weatherForecast = weatherForecast;
    }

    public void setEssentials(String essentials) {
        this.essentials = essentials;
    }

    public void setBoardingLocation(String boardingLocation) {
        this.boardingLocation = boardingLocation;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }
}
