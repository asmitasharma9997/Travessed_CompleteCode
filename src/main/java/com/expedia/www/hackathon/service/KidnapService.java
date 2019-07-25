package com.expedia.www.hackathon.service;

import com.expedia.www.hackathon.dao.MainDao;
import com.expedia.www.hackathon.entities.*;
import com.expedia.www.hackathon.util.Database;

public class KidnapService {


    private final MainDao kidnapDao;
    private final Database database;
    private int index=1;

    public KidnapService(MainDao kidnapDao) {
        this.kidnapDao = kidnapDao;
        this.database= new Database();
    }

    public Request getKidnap() {
        return kidnapDao.get(index++);
    }

    public KidnapResponse getPreferenceResponse() {
        KidnapRequest req= (KidnapRequest)kidnapDao.get(index++);
        KidnapResponse retval = new KidnapResponse();

        int randIndex=(int)(Math.random()*9);
        String origin = req.getOrigin();
        retval.setBoardingLocation(origin + "'s Airport");
        retval.setBoardingTime(req.getDate());
        retval.setEssentials("2 pair clothes, hiking bag and medication");
        retval.setWeatherForecast(database.getWeatherForecast(randIndex));

        return retval;
    }

    public Integer addKidnap(KidnapRequest perf) {
        return kidnapDao.put(perf);
    }


    public KidnapRequest deleteRequest(Integer id) {
        Request perf = kidnapDao.get(id);
        kidnapDao.remove(id);
        return (KidnapRequest) perf;
    }

}
