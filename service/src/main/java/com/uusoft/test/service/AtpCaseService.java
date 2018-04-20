package com.uusoft.test.service;

import com.uusoft.test.domain.dto.TestCaseRequest;
import com.uusoft.test.domain.entity.AtpCaseEntity;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2018 /3/21 17:17
 */
public interface AtpCaseService {


  /**
   * Creat case atp case entity.
   *
   * @param testCaseRequest the test case request
   * @return the atp case entity
   */
  AtpCaseEntity creatCase(TestCaseRequest testCaseRequest);

  /**
   * Update case atp case entity.
   *
   * @param atpCaseEntity the atp case entity
   * @return the atp case entity
   */
  AtpCaseEntity updateCase(AtpCaseEntity atpCaseEntity);

  /**
   * Delete case.
   *
   * @param caseId the case id
   */
  void deleteCase(int caseId);
}
