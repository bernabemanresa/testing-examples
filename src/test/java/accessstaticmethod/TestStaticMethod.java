package accessstaticmethod;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static accessstaticmethod.PrintDate.UNKNOW_DATE;

class TestStaticMethod {

  @Test
  void givenNullFormattedDateReturnMessageWithUnknow() {
    PrintDate printDate = new PrintDate() {
      @Override
      protected String getFormattedDate(Date date) {
        return null;
      }
    };
    Assertions.assertEquals("Bernabé" + " " + UNKNOW_DATE,
        printDate.formatMessage("Bernabé", new Date()));
  }

  @Test
  void givenFormattedDateReturnMessageWithFormattedDate() {
    PrintDate printDate = new PrintDate() {
      @Override
      protected String getFormattedDate(Date date) {
        return "2021-12-01";
      }
    };
    Assertions.assertEquals("Bernabé" + " " + "2021-12-01",
        printDate.formatMessage("Bernabé", new Date()));
  }

  @Test
  void givenValidDateReturnFormattedMessage() {
    Date date1970 = new Date();
    date1970.setTime(0);

    PrintDate printDate = new PrintDate();

    Assertions.assertEquals("Bernabé 1970-01-01",
        printDate.formatMessage("Bernabé", date1970));
  }

}
