package com.codurance;

public class RomanNumeral {

  public static String romanFor(int input) {
    if (input == 5){
      return "V";
    }

    return "I".repeat(input);
  }
}
