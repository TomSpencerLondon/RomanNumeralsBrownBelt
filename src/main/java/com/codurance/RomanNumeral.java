package com.codurance;

import java.util.Map;

public class RomanNumeral {

  public static String romanFor(int input) {
    String result = "";

    for(Roman roman : Roman.values()) {
      while (input >= roman.arabic) {
        result += roman.toString();
        input -= roman.arabic;
      }
    }

    return result;
  }

  public static int arabicFor(String input) {
    Map<Character, Integer> numerals = Map.of('X', 10, 'V', 5, 'I', 1);

   int result = numerals.get(input.charAt(input.length() - 1));

    for (int i = input.length() - 2; i >= 0; i--){
     if (numerals.get(input.charAt(i)) < numerals.get(input.charAt(i + 1))){
       result -= numerals.get(input.charAt(i));
     }else {
       result += numerals.get(input.charAt(i));
     }
   }

    return result;
  }


  private enum Roman {
    X(10), IX(9), V(5), IV(4), I(1);

    int arabic;

    Roman(int arabic) {
      this.arabic = arabic;
    }
  }
}
