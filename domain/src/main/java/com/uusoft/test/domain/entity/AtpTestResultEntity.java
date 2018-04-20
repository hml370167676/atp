package com.uusoft.test.domain.entity;

import com.uusoft.test.common.enumeration.TestResult;
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
 * @date 2018/3/21 12:23
 */
@Entity
@Table(name = "atp_testresult", schema = "atp")
public class AtpTestResultEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = -6193206116527084079L;

  /**
   * 测试结果Id
   */
  private int resultId;
  /**
   * 测试用例Id
   */
  private AtpCaseEntity atpCase;
  /**
   * 返回信息
   */
  private String returnInfo;
  /**
   * 断言信息
   */
  private String assertInfo;
  /**
   * 断言结果信息
   */
  private String resultInfo;

  /**
   * 结果（成功失败）
   */
  private TestResult result;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "resultId", unique = true, columnDefinition = "int(11) COMMENT '测试结果ID'")
  public int getResultId() {
    return resultId;
  }

  public void setResultId(int resultId) {
    this.resultId = resultId;
  }

  @ManyToOne
  @JoinColumn(name = "caseId", nullable = false, columnDefinition = "int(11) COMMENT '测试用例ID'")
  public AtpCaseEntity getAtpCase() {
    return atpCase;
  }

  public void setAtpCase(AtpCaseEntity atpCase) {
    this.atpCase = atpCase;
  }

  @Column(name = "returnInfo", nullable = false, columnDefinition = "varchar(2000) COMMENT '测试用例返回信息'")
  public String getReturnInfo() {
    return returnInfo;
  }

  public void setReturnInfo(String returnInfo) {
    this.returnInfo = returnInfo;
  }

  @Column(name = "assertInfo", columnDefinition = "varchar(200) COMMENT '断言信息'")
  public String getAssertInfo() {
    return assertInfo;
  }

  public void setAssertInfo(String assertInfo) {
    this.assertInfo = assertInfo;
  }

  @Column(name = "resultInfo", columnDefinition = "varchar(2000) COMMENT '测试结果信息（断言结果）'")
  public String getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }

  @Column(name = "result", columnDefinition = "varchar(200) COMMENT '测试结果'")
  public TestResult getResult() {
    return result;
  }

  public void setResult(TestResult result) {
    this.result = result;
  }
}
