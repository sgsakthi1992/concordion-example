package org.example;

import java.util.Map;
import org.concordion.api.MultiValueResult;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture {
  public MultiValueResult split(String fullName) {
    //
    Map<String, String> words = new SplittingNames().split(fullName);
    //
    return new MultiValueResult()
        .with("firstName", words.get("firstName"))
        .with("lastName", words.get("lastName"));
  }
}