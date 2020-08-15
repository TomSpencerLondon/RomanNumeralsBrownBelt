package com.codurance;

import java.util.Map;

public class RomanNumeral {

  public static String romanFor(int input) {
    String result = "";

    for (Roman roman : Roman.values()) {
      while (input >= roman.arabic) {
        result += roman.toString();
        input -= roman.arabic;
      }
    }

    return result;
  }

  public static int arabicFor(String roman) {
    Map<Character, Integer> numeralValues = Map.of(
            'M', 1000,
        'D', 500,
        'C', 100,
        'L', 50,
        'X', 10,
        'V', 5,
        'I', 1);

    int result = numeralValues.get(lastChar(roman));

    for (int i = roman.length() - 2; i >= 0; i--) {
      Integer currentNumeral = numeralValues.get(roman.charAt(i));
      if (currentNumeral < numeralValues.get(roman.charAt(i + 1))) {
        result -= currentNumeral;
      } else {
        result += currentNumeral;
      }
    }

    return  result;
  }

  private static char lastChar(String input) {
    return input.charAt(input.length() - 1);
  }


  private enum Roman {
    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    int arabic;

    Roman(int arabic) {
      this.arabic = arabic;
    }
  }
}
