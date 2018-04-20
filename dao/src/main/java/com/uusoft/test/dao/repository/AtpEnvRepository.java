package com.uusoft.test.dao.repository;

import com.uusoft.test.domain.entity.AtpEnvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Atp url repository.
 */
@Repository
public interface AtpEnvRepository extends JpaRepository<AtpEnvEntity, Integer> {

  /**
   * Find by url id atp url entity.
   *
   * @param envId the env id
   * @return the atp url entity
   */
  AtpEnvEntity findByEnvId(int envId);

  /**
   * Find by atp system system id atp url entity.
   *
   * @param systemId the system id
   * @return the atp url entity
   */
  AtpEnvEntity findByAtpSystemSystemId(int systemId);

}
