package com.expedia.www.hackathon.controller;

import com.expedia.www.hackathon.dao.KidnapDaoInMemory;
import com.expedia.www.hackathon.dao.MainDao;
import com.expedia.www.hackathon.entities.KidnapRequest;
import com.expedia.www.hackathon.entities.KidnapResponse;
import com.expedia.www.hackathon.entities.UserPreferencesRequest;
import com.expedia.www.hackathon.service.KidnapService;
import com.expedia.www.hackathon.util.JerseyResponseHelpers;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("/kidnap")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class KidnapController {

    private KidnapService kidnapService;

    public KidnapController(){
        MainDao kidnapDao = new KidnapDaoInMemory();
        this.kidnapService = new KidnapService(kidnapDao);
    }

    @POST
    public Response addKidnap(KidnapRequest kidnap){
        if(kidnap!=null){
            Integer id =kidnapService.addKidnap(kidnap);
            return JerseyResponseHelpers.sendSuccessfulCreatedResponse(id);
        } else{
            return JerseyResponseHelpers.sendBadRequestError("Employee object null");
        }
    }

    @GET    //Called by ui, send them the itinerary
    public Response getKidnap(){
        KidnapResponse kidnap = kidnapService.getPreferenceResponse();
        if(kidnap==null){
            return JerseyResponseHelpers.sendInternalServerError("Employee not found");
        } else{
            return JerseyResponseHelpers.sendSuccessfulResponse(kidnap);
        }
    }
}