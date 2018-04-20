package com.uusoft.test.domain.entity;

import com.uusoft.test.common.enumeration.InterfaceType;
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
 * <p>Description:接口信息表</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/14 15:31
 */
@Entity
@Table(name = "atp_interface", schema = "atp")
public class AtpInterfaceEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 4041440460286964233L;
  /**
   * 接口ID
   */
  private int interfaceId;
  /**
   * 接口名称
   */
  private String interfaceName;
  /**
   * 接口类型：Http,Https,Dubbo
   */
  private InterfaceType interfaceType;
  /**
   * 接口所属系统
   */
  private AtpSystemEntity atpSystem;
  /**
   * 接口对应功能号
   */
  private BusinesscodeEntity businesscode;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "interfaceId", columnDefinition = "int(11) COMMENT '接口ID'")
  public int getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(int interfaceId) {
    this.interfaceId = interfaceId;
  }

  @Column(name = "interfaceName", unique = true, nullable = false, columnDefinition = "varchar(100) COMMENT '接口名称'")
  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  @Column(name = "interfaceType", nullable = false, columnDefinition = "varchar(100) COMMENT '接口类型'")
  public InterfaceType getInterfaceType() {
    return interfaceType;
  }

  public void setInterfaceType(InterfaceType interfaceType) {
    this.interfaceType = interfaceType;
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
  @JoinColumn(name = "businesscode", columnDefinition = "varchar(100) COMMENT '接口对应功能号'")
  public BusinesscodeEntity getBusinesscode() {
    return businesscode;
  }

  public void setBusinesscode(BusinesscodeEntity businesscode) {
    this.businesscode = businesscode;
  }
}
