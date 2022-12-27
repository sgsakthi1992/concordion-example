package org.example;

import java.util.HashMap;
import java.util.Map;

public class SplittingNames {

  public Map<String, String> split(String fullName) {
    String[] words = fullName.split(" ");
    Map<String, String> results = new HashMap<>();
    results.put("firstName", words[0]);
    results.put("lastName", words[1]);
    return results;
  }

}
