package com.uusoft.test.dao.repository;

import com.uusoft.test.common.enumeration.InterfaceType;
import com.uusoft.test.domain.entity.AtpInterfaceEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Atp interface repository.
 */
@Repository
public interface AtpInterfaceRepository extends JpaRepository<AtpInterfaceEntity, Integer> {

  /**
   * Find by interface id atp interface entity.
   *
   * @param interfaceId the interface id
   * @return the atp interface entity
   */
  AtpInterfaceEntity findByInterfaceId(int interfaceId);


  /**
   * Find by businesscode atp interface entity.
   *
   * @param businesscode the businesscode
   * @return the atp interface entity
   */
  List<AtpInterfaceEntity> findAllByBusinesscode(String businesscode);

  /**
   * Find by interface type list.
   *
   * @param interfaceType the interface type
   * @return the list
   */
  List<AtpInterfaceEntity> findByInterfaceType(InterfaceType interfaceType);

  /**
   * Find all by atp system system id list.
   *
   * @param systemId the system id
   * @return the list
   */
  List<AtpInterfaceEntity> findALLByAtpSystemSystemId(int systemId);


}
