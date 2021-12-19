package katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*Trolls are attacking your comment section!A common way to deal with this situation is to remove
all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.*/

public class Troll {

  public static String disemvowel(String str) {
    return str.replaceAll("(?i)[aeiou]", "");
  }

  @Test
  void testKata() {
    Assertions.assertEquals("", disemvowel(""));
    Assertions.assertEquals("", disemvowel("aeiouAEIOU"));
    Assertions.assertEquals(
        "LRM PSM DLR ST MT, cnscttr dpscng lt, sd d smd tmpr ncddnt t lbr t dlr mgn lq", disemvowel(
            "LOREM IPSUM DOLOR SIT AMET, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"));
  }

}