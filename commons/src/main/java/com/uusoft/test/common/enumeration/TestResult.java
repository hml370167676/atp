package com.uusoft.test.common.enumeration;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/22 10:57
 */
public enum TestResult {

  SUCCESS(0, "成功"),
  FAILED(1, "失败");

  private int code;
  private String desc;

  private TestResult(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
