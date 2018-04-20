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
 * @date 2018/3/21 14:00
 */
@Entity
@Table(name = "atpEnv", schema = "atp")
public class AtpEnvEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 430819328890569047L;

  /**
   * 环境ID
   */
  private int envId;
  /**
   * 环境名称
   */
  private String envName;
  /**
   * 所属系统
   */
  private AtpSystemEntity atpSystem;
  /**
   * url地址
   */
  private String url;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "envId", columnDefinition = "int(11) COMMENT 'envId' ")
  public int getEnvId() {
    return envId;
  }

  public void setEnvId(int envId) {
    this.envId = envId;
  }

  @Column(name = "envName", nullable = false, columnDefinition = "varchar(200) COMMENT '环境名称' ")
  public String getEnvName() {
    return envName;
  }

  public void setEnvName(String envName) {
    this.envName = envName;
  }

  @ManyToOne
  @JoinColumn(name = "systemId", columnDefinition = "varchar(200) COMMENT '所属系统' ")
  public AtpSystemEntity getAtpSystem() {
    return atpSystem;
  }

  public void setAtpSystem(AtpSystemEntity atpSystem) {
    this.atpSystem = atpSystem;
  }

  @Column(name = "url", nullable = false, columnDefinition = "varchar(200) COMMENT 'URL地址' ")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
