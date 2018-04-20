package com.uusoft.test.domain.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/22 14:18
 */
public class TestCaseRequest implements Serializable {

  private static final long serialVersionUID = 976454448067289850L;

  /**
   * @NotEmpty 用在集合类上面
   * @NotBlank 用在String上面
   * @NotNull 用在基本类型上
   */
  @NotBlank(message = "caseName 不能为空")
  private String caseName;
  @NotBlank(message = "interfaceId 不能为空")
  private int interfaceId;
  @NotBlank(message = "systemId 不能为空")
  private int systemId;
  @NotBlank(message = "businesscodeId 不能为空")
  private int businesscodeId;
  @NotBlank(message = "envId 不能为空")
  private int envId;
  @NotBlank(message = "caseInfo 不能为空")
  private String caseInfo;

  public String getCaseName() {
    return caseName;
  }

  public void setCaseName(String caseName) {
    this.caseName = caseName;
  }

  public int getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(int interfaceId) {
    this.interfaceId = interfaceId;
  }

  public int getSystemId() {
    return systemId;
  }

  public void setSystemId(int systemId) {
    this.systemId = systemId;
  }

  public int getBusinesscodeId() {
    return businesscodeId;
  }

  public void setBusinesscodeId(int businesscodeId) {
    this.businesscodeId = businesscodeId;
  }

  public int getEnvId() {
    return envId;
  }

  public void setEnvId(int envId) {
    this.envId = envId;
  }

  public String getCaseInfo() {
    return caseInfo;
  }

  public void setCaseInfo(String caseInfo) {
    this.caseInfo = caseInfo;
  }
}
