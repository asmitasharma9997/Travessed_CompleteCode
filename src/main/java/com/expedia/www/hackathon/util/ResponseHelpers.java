package com.expedia.www.hackathon.util;

import com.expedia.www.hackathon.entities.UserPreferencesRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class ResponseHelpers {


  private static ObjectMapper mapper = new ObjectMapper();

  public static void sendResponse(HttpServletResponse resp, Optional<UserPreferencesRequest> pref) {
    try {
      if (pref.isPresent()) {
        resp.setContentType("text/plain");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().println(mapper.writeValueAsString(pref.get()));
      } else {
        resp.setContentType("text/plain");
        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        resp.getWriter().println("employee not found");
      }
    } catch (IOException e) {
      System.out.println("Exception while writing " + e.getMessage());
    }
  }


  public static void sendBadRequest(HttpServletResponse resp) {
    try {
      resp.setContentType("text/plain");
      resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      resp.getWriter().println("bad request");
    } catch (IOException e) {
      System.out.println("Exception while writing " + e.getMessage());
    }
  }


  public static void sendBoolResponse(HttpServletResponse resp, boolean result) {
    try {
      if (result) {
        resp.setStatus(HttpServletResponse.SC_OK);
      } else {
        resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      }
      resp.setContentType("text/plain");
      resp.getWriter().println(result);
    } catch (IOException e) {
      System.out.println("Exception while writing " + e.getMessage());
    }
  }


  public static void sendIntegerResponse(HttpServletResponse resp, Integer result) {
    try {
      resp.setStatus(HttpServletResponse.SC_OK);
      resp.setContentType("text/plain");
      resp.getWriter().println(result);
    } catch (IOException e) {
      System.out.println("Exception while writing " + e.getMessage());
    }
  }
}
