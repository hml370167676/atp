package com.uusoft.test.dao.repository;

import com.uusoft.test.domain.entity.AtpCaseEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2018 /3/21 13:56
 */
@Repository
public interface AtpCaseRepository extends JpaRepository<AtpCaseEntity, Integer> {

  /**
   * Find by case id atp case entity.
   *
   * @param caseId the case id
   * @return the atp case entity
   */
  AtpCaseEntity findByCaseId(int caseId);

  /**
   * Find all by atp interface interface id list.
   *
   * @param interfaceId the interface id
   * @return the list
   */
  List<AtpCaseEntity> findAllByAtpInterfaceInterfaceId(int interfaceId);

  /**
   * Find all by atpInterface interface id and business code list.
   *
   * @param interfaceId the interface id
   * @param businesscode the businesscode
   * @return the list
   */
  List<AtpCaseEntity> findAllByAtpInterfaceInterfaceIdAndBusinesscode(int interfaceId,
      String businesscode);

}
