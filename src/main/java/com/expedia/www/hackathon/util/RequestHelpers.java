package com.expedia.www.hackathon.util;

import com.expedia.www.hackathon.entities.UserPreferencesRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

public class RequestHelpers {

  private static ObjectMapper mapper = new ObjectMapper();

  public static UserPreferencesRequest parseBody(HttpServletRequest req) {
    try {
      StringBuilder buffer = new StringBuilder();
      BufferedReader reader = req.getReader();
      String line;
      while ((line = reader.readLine()) != null) {
        buffer.append(line);
      }
      String data = buffer.toString();
      return mapper.readValue(data, UserPreferencesRequest.class);
    } catch (Exception e) {
      return null;
    }
  }
}
