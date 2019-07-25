package com.expedia.www.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorEntity {

  private final String errorMessage;


  @JsonCreator
  public ErrorEntity(@JsonProperty("errorMessage") String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
