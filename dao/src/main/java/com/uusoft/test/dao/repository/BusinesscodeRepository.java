package com.uusoft.test.dao.repository;

import com.uusoft.test.domain.entity.BusinesscodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2018 /3/20 19:53
 */
public interface BusinesscodeRepository extends JpaRepository<BusinesscodeEntity, Integer> {

  /**
   * Find by businesscode business code entity.
   *
   * @param Businesscode the businesscode
   * @return the business code entity
   */
  BusinesscodeEntity findByBusinesscode(String Businesscode);

  /**
   * Find by businesscode id business code entity.
   *
   * @param businesscodeId the businesscode id
   * @return the business code entity
   */
  BusinesscodeEntity findByBusinesscodeId(int businesscodeId);

}
