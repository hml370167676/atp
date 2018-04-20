package com.uusoft.test.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:业务类型实例</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/20 19:40
 */
@Entity
@Table(name = "atp_businesscode", schema = "atp")
public class BusinesscodeEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 916691240419859682L;
  /**
   * businessCodeID
   */
  private int businesscodeId;
  /**
   * businesscode
   */
  private String businesscode;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "businesscodeId", columnDefinition = "int(11) COMMENT '业务类型ID'")
  public int getBusinesscodeId() {
    return businesscodeId;
  }

  public void setBusinesscodeId(int businesscodeId) {
    this.businesscodeId = businesscodeId;
  }

  @Column(name = "businesscode", unique = true, nullable = false, columnDefinition = "varchar(20) COMMENT '业务类型码'")
  public String getBusinesscode() {
    return businesscode;
  }

  public void setBusinesscode(String businesscode) {
    this.businesscode = businesscode;
  }
}
