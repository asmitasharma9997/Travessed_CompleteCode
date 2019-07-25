package com.expedia.www.hackathon.service;

import com.expedia.www.hackathon.dao.MainDao;
import com.expedia.www.hackathon.entities.Request;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;
import com.expedia.www.hackathon.entities.UserPreferencesResponse;
import com.expedia.www.hackathon.util.Database;

public class PrefService {


        private final MainDao prefDao;
        private final Database database;

        public PrefService(MainDao prefDao) {
            this.prefDao = prefDao;
            this.database= new Database();
        }

        public Request getPreference() {
            return prefDao.get(0);
        }

        public UserPreferencesResponse getPreferenceResponse() {
            Request req= prefDao.get(0);
            UserPreferencesResponse retval = new UserPreferencesResponse();

            int randIndex=(int)(Math.random()*9);
            retval.setFlightName(database.getFlightName(randIndex));
            retval.setCarDriverInfo(database.getCarDriverInfo(randIndex));
            retval.setCarModel(database.getCarModel(randIndex));
            retval.setCarNumber(database.getCarNumber(randIndex));
            retval.setDestination(database.getDestination(randIndex));
            retval.setFlightArrivalDate("12th November 2019");
            retval.setFlightDepartureDate("25th October 2019");
            retval.setFlightDestination(database.getFlightDestination(randIndex));
            retval.setFlightPrice(Math.random()*40000+40000+"");
            retval.setHotelAddress(database.getHotelAddress(randIndex));
            retval.setHotelCheckInDate("27th October 2019");
            retval.setHotelCheckOutDate("11th November 2019");
            retval.setHotelName(database.getHotelName(randIndex));
            retval.setHotelPrice(Math.random()*5000+6000+"");

            return retval;
        }

        public Integer addPreference(UserPreferencesRequest perf) {
            return prefDao.put(perf);
        }


        public UserPreferencesRequest deletePreference(Integer id) {
            Request perf = prefDao.get(id);
            prefDao.remove(id);
            return (UserPreferencesRequest)perf;
        }

    }
