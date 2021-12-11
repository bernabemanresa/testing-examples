package accessstaticmethod;

import java.util.Date;

import com.bernabe.helpers.FormatDateHelper;

public class PrintDate {

  protected static final String UNKNOW_DATE = "unknow date";

  public String formatMessage(String name, Date date) {
    // Static call, hard to test!
    //String formattedDate = FormatDateHelper.formatDate(date);
    String formattedDate = getFormattedDate(date);
    if (formattedDate == null) {
      formattedDate = UNKNOW_DATE;
    }
    return name + " " + formattedDate;
  }

  // Isolate static methods calls in protected methods by a little refactor, helps us to test it much better.
  protected String getFormattedDate(Date date) {
    return FormatDateHelper.formatDate(date);
  }
}
