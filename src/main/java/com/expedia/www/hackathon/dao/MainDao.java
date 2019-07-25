package com.expedia.www.hackathon.dao;

import com.expedia.www.hackathon.entities.Request;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;

public interface MainDao {
    Integer put(Request emp);

    Request get(int id);

    void remove(int id);
}
