package com.bernabe.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;


public final class FormatDateHelper {

  public static String formatDate(Date date) {
    if (date == null) return null;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    return format.format(date);
  }

}
