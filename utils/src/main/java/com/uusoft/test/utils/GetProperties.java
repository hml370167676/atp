package com.uusoft.test.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class GetProperties {

  protected static Locale locale = Locale.getDefault();
  protected static ResourceBundle configRb = ResourceBundle
      .getBundle("config/config", Locale.CHINA);
  protected static ResourceBundle instRb = ResourceBundle.getBundle("config/instId", Locale.CHINA);

  /**
   * 获取属性文件的键值
   */
  public static String getValue(String key) {
    return configRb.getString(key).trim();
  }

  public static String getInstValue(String key) {
    return instRb.getString(key).trim();
  }
}
