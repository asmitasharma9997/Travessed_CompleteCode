package com.expedia.www.hackathon.util;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {

    ArrayList<String> flightNames;
    ArrayList<String> destination;
    ArrayList<String> flightDestination;
    ArrayList<String> hotelName;
    ArrayList<String> hotelAddress;
    ArrayList<String> carModel;
    ArrayList<String> carNumber;
    ArrayList<String> carDriverInfo;
    ArrayList<String> weatherForecast;

    public Database() {
        this.flightNames = new ArrayList<>();
        this.destination = new ArrayList<>();
        this.hotelName = new ArrayList<>();
        this.hotelAddress = new ArrayList<>();
        this.carModel = new ArrayList<>();
        this.carNumber = new ArrayList<>();
        this.carDriverInfo = new ArrayList<>();
        this.flightDestination = new ArrayList<>();
        this.weatherForecast = new ArrayList<>();

        setFlightName();
        setDestination();
        setHotelName();
        setHotelAddress();
        setCarModel();
        setCarNumber();
        setCarDriverInfo();
        setFlightDestination();
        setWeatherForecast();
    }

    public void setWeatherForecast(){
        this.weatherForecast.add("Winter");
        this.weatherForecast.add("Summer");
        this.weatherForecast.add("Extreme winters (-20 degrees)");
        this.weatherForecast.add("Autumn");
        this.weatherForecast.add("Rainy");
        this.weatherForecast.add("Sunny");
        this.weatherForecast.add("Extremely hot");
        this.weatherForecast.add("Pleasant");
        this.weatherForecast.add("Summer");
    }

    public void setFlightDestination(){
        this.flightDestination.add("YYI");
        this.flightDestination.add("CAA");
        this.flightDestination.add("CAK");
        this.flightDestination.add("UAM");
        this.flightDestination.add("MAB");
        this.flightDestination.add("IGI");
        this.flightDestination.add("DXB");
        this.flightDestination.add("RIO");
        this.flightDestination.add("HYD");
    }

    public void setFlightName() {
        this.flightNames.add("Lufthansa");
        this.flightNames.add("Emirates");
        this.flightNames.add("Air India");
        this.flightNames.add("Air Canada");
        this.flightNames.add("Atlanta Airlines");
        this.flightNames.add("United Airlines");
        this.flightNames.add("Etihad");
        this.flightNames.add("Cathay Pacific");
        this.flightNames.add("Qatar Airlines");
    }

    public void setDestination() {
        this.destination.add("Hongkong");
        this.destination.add("Los Angeles, USA");
        this.destination.add("Toronto, Canada");
        this.destination.add("London");
        this.destination.add("Paris");
        this.destination.add("Rome");
        this.destination.add("Switzerland");
        this.destination.add("Rome");
        this.destination.add("Dubai");
    }

    public void setHotelName() {
        this.hotelName.add("First World Hotel");
        this.hotelName.add("The Palazzo");
        this.hotelName.add("Sheraton Grand");
        this.hotelName.add("Bellagio");
        this.hotelName.add("Atlantis Paradise Island");
        this.hotelName.add("The Mirage");
        this.hotelName.add("The Parisian");
        this.hotelName.add("Hyatt Regency");
        this.hotelName.add("Le Meridien");
    }

    public void setHotelAddress() {
        this.hotelAddress.add("Port Washington");
        this.hotelAddress.add("South Bombay");
        this.hotelAddress.add("Sheboygan");
        this.hotelAddress.add("Burlington");
        this.hotelAddress.add("New Delhi");
        this.hotelAddress.add("Los Angeles");
        this.hotelAddress.add("Jeju Island");
        this.hotelAddress.add("Santiego");
        this.hotelAddress.add("Sao Pualo");
    }

    public void setCarModel() {
        this.carModel.add("Hyundai");
        this.carModel.add("Toyota");
        this.carModel.add("Tesla");
        this.carModel.add("Mercedeez Benz");
        this.carModel.add("Audi");
        this.carModel.add("BMW");
        this.carModel.add("MG Hector");
        this.carModel.add("Volkswagen");
        this.carModel.add("Porsche");
    }

    public void setCarNumber() {
        this.carNumber.add("DL-01-ZE-1234");
        this.carNumber.add("AB-12345");
        this.carNumber.add("A086511");
        this.carNumber.add("WADE C1");
        this.carNumber.add("ABC 123D");
        this.carNumber.add("XFSDSM 56");
        this.carNumber.add("BSMK91");
        this.carNumber.add("MH-ZE-0934");
        this.carNumber.add("CA-788");
    }

    public void setCarDriverInfo() {
        this.carDriverInfo.add("Mr. Alex Fernandez");
        this.carDriverInfo.add("Mr. Ashish Kumar");
        this.carDriverInfo.add("Ms. Lisa");
        this.carDriverInfo.add("Mr. John Day");
        this.carDriverInfo.add("Mr. Mark");
        this.carDriverInfo.add("Mr. Jeff Bezos");
        this.carDriverInfo.add("Mr. Alex");
        this.carDriverInfo.add("Mr. Bob");
        this.carDriverInfo.add("Ms. Katherine");
    }

    public String getFlightName(int randIndex) {
        return this.flightNames.get(randIndex);
    }

    public String getDestination(int randIndex){
        return this.destination.get(randIndex);
    }

    public String getHotelName(int randIndex) {
        return this.hotelName.get(randIndex);
    }

    public String getHotelAddress(int randIndex) {
        return this.hotelAddress.get(randIndex);
    }

    public String getCarModel(int randIndex) {
        return this.carModel.get(randIndex);
    }

    public String getCarNumber(int randIndex) {
        return this.carNumber.get(randIndex);
    }

    public String getCarDriverInfo(int randIndex) {
        return this.carDriverInfo.get(randIndex);
    }

    public String getFlightDestination(int randIndex){
        return this.flightDestination.get(randIndex);
    }

    public String getWeatherForecast(int randIndex) {
        return weatherForecast.get(randIndex);
    }

}
