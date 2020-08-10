package com.codurance;

public class RomanNumeral {

  public static String romanFor(int input) {
    String result = "";

    if (input >= 10) {
      result += "X";
      input -= 10;
    }

    if (input >= 5) {
      result += "V";
      input -= 5;
    }

    if (input >= 4) {
      result += "IV";
      input -= 4;
    }

    result += "I".repeat(input);

    return result;
  }
}
