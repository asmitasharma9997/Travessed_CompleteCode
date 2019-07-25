package com.expedia.www.hackathon.util;

import com.expedia.www.hackathon.entities.ErrorEntity;
import org.eclipse.jetty.http.HttpStatus;

import javax.ws.rs.core.Response;

public class JerseyResponseHelpers {

    public static <T> Response sendSuccessfulResponse  (T object) {
        return Response.status(HttpStatus.OK_200)
            .entity(object)
            .build();
    }
    public static <T> Response sendSuccessfulCreatedResponse  (T object) {
        return Response.status(HttpStatus.CREATED_201)
            .entity(object)
            .build();
    }

    public static Response sendBadRequestError(String errorMessage) {
        ErrorEntity errorEntity = new ErrorEntity(errorMessage);
        return Response.status(HttpStatus.BAD_REQUEST_400)
            .entity(errorEntity)
            .build();
    }

    public static Response sendInternalServerError(String errorMessage) {
        ErrorEntity errorEntity = new ErrorEntity(errorMessage);
        return Response.status(HttpStatus.INTERNAL_SERVER_ERROR_500)
            .entity(errorEntity)
            .build();
    }

}
