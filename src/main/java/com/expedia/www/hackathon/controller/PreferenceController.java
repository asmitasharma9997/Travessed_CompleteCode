package com.expedia.www.hackathon.controller;

import com.expedia.www.hackathon.dao.MainDao;
import com.expedia.www.hackathon.dao.PreferenceDaoInMemory;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;
import com.expedia.www.hackathon.entities.UserPreferencesResponse;
import com.expedia.www.hackathon.service.PrefService;
import com.expedia.www.hackathon.util.JerseyResponseHelpers;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("/preference")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PreferenceController {

    private PrefService prefService;

    public PreferenceController(){
        MainDao prefDao = new PreferenceDaoInMemory();
        this.prefService = new PrefService(prefDao);
    }

    @POST
    public Response addPreference(UserPreferencesRequest pref){
        if(pref!=null){
            Integer id =prefService.addPreference(pref);
            return JerseyResponseHelpers.sendSuccessfulCreatedResponse(id);
        } else{
            return JerseyResponseHelpers.sendBadRequestError("Employee object null");
        }
    }

    @GET    //Called by ui, send them the itinerary
    public Response getPreference(){
        UserPreferencesResponse pref = prefService.getPreferenceResponse();
        if(pref==null){
            return JerseyResponseHelpers.sendInternalServerError("Employee not found");
        } else{
            return JerseyResponseHelpers.sendSuccessfulResponse(pref);
        }
    }

}
