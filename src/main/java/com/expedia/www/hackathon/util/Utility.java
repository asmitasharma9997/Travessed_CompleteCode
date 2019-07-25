package com.expedia.www.hackathon.util;

public class Utility {
  public static String extractPathParam(String uri) {
    String[] strArr = uri.split("/");
    return strArr[strArr.length-1];
  }
}
