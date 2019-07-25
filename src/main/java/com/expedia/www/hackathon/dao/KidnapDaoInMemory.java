package com.expedia.www.hackathon.dao;

import com.expedia.www.hackathon.entities.KidnapRequest;
import com.expedia.www.hackathon.entities.Request;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class KidnapDaoInMemory implements MainDao {

    Map<Integer, KidnapRequest> idToKidnapMap;
    private final AtomicInteger counter = new AtomicInteger(0);

    public KidnapDaoInMemory() {
        idToKidnapMap = new HashMap<>();
    }

    @Override
    public Integer put(Request kidnap) {
        Integer id = counter.incrementAndGet();
        idToKidnapMap.put(id, (KidnapRequest) kidnap);
        return id;
    }

    @Override
    public Request get(int id) {
        return idToKidnapMap.get(id);
    }

    @Override
    public void remove(int id) {
        idToKidnapMap.remove(id);
    }
}
