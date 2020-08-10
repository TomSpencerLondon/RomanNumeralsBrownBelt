package com.codurance;

import static com.codurance.RomanNumeral.arabicFor;
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
      "4, IV",
      "5, V",
      "6, VI",
      "8, VIII",
      "9, IX",
      "10, X",
      "11, XI",
      "15, XV",
      "30, XXX"
  })
  void return_roman_for_arabic(int input, String output) {
    assertEquals(output, romanFor(input));
  }

  @ParameterizedTest
  @CsvSource({
      "I, 1",
      "II, 2",
      "III, 3",
      "IV, 4",
      "V, 5",
      "VIII, 8",
      "IX, 9",
      "X, 10",
      "XXXIX, 39"
  })
  void return_arabic_for_roman(String input, int output) {
    assertEquals(output, arabicFor(input));
  }
}
