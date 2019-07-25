package com.expedia.www.hackathon.dao;

import com.expedia.www.hackathon.entities.Request;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PreferenceDaoInMemory implements MainDao {

    Map<Integer, UserPreferencesRequest> idToPreferenceMap;
    private final AtomicInteger counter = new AtomicInteger(0);

    public PreferenceDaoInMemory() {
        idToPreferenceMap = new HashMap<>();
    }

    @Override
    public Integer put(Request pref) {
        Integer id = counter.incrementAndGet();
        idToPreferenceMap.put(id, (UserPreferencesRequest) pref);
        return id;
    }

    @Override
    public UserPreferencesRequest get(int id) {
        return idToPreferenceMap.get(id);
    }

    @Override
    public void remove(int id) {
        idToPreferenceMap.remove(id);
    }
}
