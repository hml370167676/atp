package com.uusoft.test.domain.entity;

import java.io.Serializable;
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
 * @date 2018/3/19 14:26
 */
@Entity
@Table(name = "atp_system", schema = "atp")
public class AtpSystemEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1235377996116992145L;
  /**
   * 系统ID
   */
  private int systemId;
  /**
   * 系统名称
   */
  private String systemName;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "systemId", columnDefinition = "int(11) COMMENT '系统ID'")
  public int getSystemId() {
    return systemId;
  }

  public void setSystemId(int systemId) {
    this.systemId = systemId;
  }

  @Column(name = "systemName", unique = true, nullable = false, columnDefinition = "varchar(100) COMMENT '系统名称'")
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }
}
