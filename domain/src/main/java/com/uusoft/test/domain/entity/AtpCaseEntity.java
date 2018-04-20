package com.uusoft.test.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/21 11:20
 */
@Entity
@Table(name = "atp_case", schema = "atp")
public class AtpCaseEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = -1116822920660251573L;
  /**
   * 测试用例ID
   */
  private int caseId;
  /**
   * 测试用例名称
   */
  private String caseName;
  /**
   * 测试接口
   */
  private AtpInterfaceEntity atpInterface;
  /**
   * 测试系统
   */
  private AtpSystemEntity atpSystem;
  /**
   * 业务ID
   */
  private BusinesscodeEntity businesscode;
  /**
   * 测试地址
   */
  private AtpEnvEntity atpEnv;
  /**
   * 测试用例信息
   */
  private String caseInfo;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "caseId", unique = true, columnDefinition = "int(11) COMMENT '测试用例ID'")
  public int getCaseId() {
    return caseId;
  }

  public void setCaseId(int caseId) {
    this.caseId = caseId;
  }

  @Column(name = "caseName", nullable = false, columnDefinition = "varchar(100) COMMENT '测试用例名称'")
  public String getCaseName() {
    return caseName;
  }

  public void setCaseName(String caseName) {
    this.caseName = caseName;
  }

  @ManyToOne
  @JoinColumn(name = "interfaceName", nullable = false, columnDefinition = "varchar(100) COMMENT '待测试接口'")
  public AtpInterfaceEntity getAtpInterface() {
    return atpInterface;
  }

  public void setAtpInterface(AtpInterfaceEntity atpInterface) {
    this.atpInterface = atpInterface;
  }

  @ManyToOne
  @JoinColumn(name = "systemId", nullable = false, columnDefinition = "varchar(100) COMMENT '接口所属系统'")
  public AtpSystemEntity getAtpSystem() {
    return atpSystem;
  }

  public void setAtpSystem(AtpSystemEntity atpSystem) {
    this.atpSystem = atpSystem;
  }

  @ManyToOne
  @JoinColumn(name = "businesscode", nullable = false, columnDefinition = "varchar(100) COMMENT '接口对应功能号'")
  public BusinesscodeEntity getBusinesscode() {
    return businesscode;
  }

  public void setBusinesscode(BusinesscodeEntity businesscode) {
    this.businesscode = businesscode;
  }

  @ManyToOne
  @JoinColumn(name = "testEnv", nullable = false, columnDefinition = "varchar(100) COMMENT '测试环境'")
  public AtpEnvEntity getAtpEnv() {
    return atpEnv;
  }

  public void setAtpEnv(AtpEnvEntity atpEnv) {
    this.atpEnv = atpEnv;
  }

  @Column(name = "caseInfo", nullable = false, columnDefinition = "varchar(2000) COMMENT '测试用例信息'")
  public String getCaseInfo() {
    return caseInfo;
  }

  public void setCaseInfo(String caseInfo) {
    this.caseInfo = caseInfo;
  }


}
