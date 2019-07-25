package com.expedia.www.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserPreferencesResponse implements Response{

    private String flightName;
    private String destination;
    private String flightDepartureDate;
    private String flightDestination;
    private String flightArrivalDate;
    private String flightPrice;

    private String hotelName;
    private String hotelCheckInDate;
    private String hotelCheckOutDate;
    private String hotelPrice;
    private String hotelAddress;

    private String carModel;
    private String carNumber;
    private String carDriverInfo;

    public void setFlightDepartureDate(String flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public void setFlightArrivalDate(String flightArrivalDate) {
        this.flightArrivalDate = flightArrivalDate;
    }

    public void setFlightPrice(String flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelCheckInDate(String hotelCheckInDate) {
        this.hotelCheckInDate = hotelCheckInDate;
    }

    public void setHotelCheckOutDate(String hotelCheckOutDate) {
        this.hotelCheckOutDate = hotelCheckOutDate;
    }

    public void setHotelPrice(String hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setCarDriverInfo(String carDriverInfo) {
        this.carDriverInfo = carDriverInfo;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
}
