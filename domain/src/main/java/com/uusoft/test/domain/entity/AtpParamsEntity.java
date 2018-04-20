package com.uusoft.test.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/4/19 10:29
 */
@Entity
@Table(name = "atpParams", schema = "atp")
public class AtpParamsEntity extends BaseEntity {

  /**
   * 参数ID
   */
  private int paramId;
  /**
   * 参数名称
   */
  private String paramName;
  /**
   * 参数类型
   */
  private String paramType;
  /**
   * 出现要求
   */
  private String demand;
  /**
   * 说明
   */
  private String explain;
  /**
   * 所属接口
   */
  private AtpInterfaceEntity interfaceId;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "paramId", columnDefinition = "int(11) COMMENT '参数ID'")
  public int getParamId() {
    return paramId;
  }

  public void setParamId(int paramId) {
    this.paramId = paramId;
  }

  @Column(name = "paramName", unique = true, nullable = false, columnDefinition = "varchar(100) COMMENT '参数名称'")
  public String getParamName() {
    return paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }

  @Column(name = "paramType", unique = true, nullable = false, columnDefinition = "varchar(100) COMMENT '参数类型'")
  public String getParamType() {
    return paramType;
  }

  public void setParamType(String paramType) {
    this.paramType = paramType;
  }

  public String getDemand() {
    return demand;
  }

  @Column(name = "demand", unique = true, nullable = false, columnDefinition = "varchar(100) COMMENT '出现要求'")
  public void setDemand(String demand) {
    this.demand = demand;
  }

  public String getExplain() {
    return explain;
  }

  public void setExplain(String explain) {
    this.explain = explain;
  }

  public AtpInterfaceEntity getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(AtpInterfaceEntity interfaceId) {
    this.interfaceId = interfaceId;
  }
}
