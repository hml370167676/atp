package com.uusoft.test.dao.repository;

import com.uusoft.test.domain.entity.AtpSystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2018 /3/19 14:47
 */
@Repository
public interface AtpSystemRepository extends JpaRepository<AtpSystemEntity, Integer> {

  /**
   * Find by system id atp system entity.
   *
   * @param systemId the system id
   * @return the atp system entity
   */
  AtpSystemEntity findBySystemId(int systemId);

  /**
   * Find by system name atp system entity.
   *
   * @param systemName the system name
   * @return the atp system entity
   */
  AtpSystemEntity findBySystemName(String systemName);

}
