package com.codurance;

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

  private enum Roman {
    X(10), IX(9), V(5), IV(4), I(1);

    public final int arabic;

    Roman(int arabic) {
      this.arabic = arabic;
    }
  }
}
