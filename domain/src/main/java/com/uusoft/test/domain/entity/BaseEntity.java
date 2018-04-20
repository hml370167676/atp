package com.uusoft.test.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * <p>Description:@MappedSuperclass注解使用在父类上面，是用来标识父类的; 标识的类表示其不能映射到数据库表，因为其不是一个完整的实体类，
 * 但是它所拥有的属性能够隐射在其子类对用的数据库表中</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/14 15:06
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

  /**
   * 注解@Temporal(TemporalType.DATE) 日期 注解@Temporal(TemporalType.TIME) 时间
   * 注解@Temporal(TemporalType.TIMESTAMP) 日期加时间 默认
   */

  private Date creatDate;

  private Date updateDate;

  private String extension;


  @Column(name = "creatDate", nullable = false, columnDefinition = "date COMMENT '创建时间'")
  public Date getCreatDate() {
    return creatDate;
  }

  public void setCreatDate(Date creatDate) {
    this.creatDate = creatDate;
  }

  @Column(name = "updateDate", columnDefinition = "date COMMENT '更新时间'")
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  @Column(name = "extension", columnDefinition = "varchar(200) COMMENT '预留'")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @PrePersist
  public void prePersist() {
    setCreatDate(new Date());
    setUpdateDate(new Date());
  }

  @PreUpdate
  public void preUpdate() {
    setUpdateDate(new Date());
  }


}
