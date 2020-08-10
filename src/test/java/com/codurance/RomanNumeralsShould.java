package com.codurance;

import static com.codurance.RomanNumeral.romanFor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsShould {

  @ParameterizedTest
  @CsvSource({
      "1, I",
      "2, II",
      "3, III",
      "5, V"
  })
  void return_output_for_input(int input, String output) {
    assertEquals(output, romanFor(input));
  }
}
