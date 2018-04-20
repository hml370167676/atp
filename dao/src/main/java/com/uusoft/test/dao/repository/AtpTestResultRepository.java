package com.uusoft.test.dao.repository;

import com.uusoft.test.common.enumeration.TestResult;
import com.uusoft.test.domain.entity.AtpTestResultEntity;
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
public interface AtpTestResultRepository extends JpaRepository<AtpTestResultEntity, Integer> {

  /**
   * 根据结果查询
   *
   * @param result the result
   * @return list list
   */
  List<AtpTestResultEntity> findAllByResult(TestResult result);

  /**
   * 根据测试用例查询
   *
   * @param caseId the case id
   * @return list list
   */
  List<AtpTestResultEntity> findAllByAtpCaseCaseId(int caseId);

  /**
   * 根据结果ID查询
   *
   * @param resultId the result id
   * @return atp test result entity
   */
  AtpTestResultEntity findByResultId(int resultId);

}
