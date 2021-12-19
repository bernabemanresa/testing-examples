package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Write a method, that replaces every nth char oldValue with char newValue.
 */
public class ReplaceNth {

  public static String replaceNth(String text, int n, char oldValue, char newValue) {
    char[] ch = new char[text.length()];
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == oldValue) {
        count++;
        if (count == n) {
          ch[i] = newValue;
          count = 0;
          continue;
        }
      }
      ch[i] = text.charAt(i);
    }
    return new String(ch);
  }

  @Test
   void basicTests() {
    assertEquals("Vader soid: No, I am your fother!",
        replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
    assertEquals("Vader said: No, I am your fother!",
        replaceNth("Vader said: No, I am your father!", 4, 'a', 'o'));
    assertEquals("Vader said: No, I am your father!",
        replaceNth("Vader said: No, I am your father!", 6, 'a', 'o'));
    assertEquals("Vader said: No, I am your father!",
        replaceNth("Vader said: No, I am your father!", 0, 'a', 'o'));
    assertEquals("Vader said: No, I am your father!",
        replaceNth("Vader said: No, I am your father!", -2, 'a', 'o'));
    assertEquals("Vader sayd: No, I am your father!",
        replaceNth("Vader said: No, I am your father!", 1, 'i', 'y'));
    assertEquals("Luke cries: Noooooioooooioooo!",
        replaceNth("Luke cries: Noooooooooooooooo!", 6, 'o', 'i'));
  }


}
