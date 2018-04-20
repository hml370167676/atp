package com.uusoft.test.service.impl;

import com.uusoft.test.dao.repository.AtpCaseRepository;
import com.uusoft.test.dao.repository.AtpEnvRepository;
import com.uusoft.test.dao.repository.AtpInterfaceRepository;
import com.uusoft.test.dao.repository.AtpSystemRepository;
import com.uusoft.test.dao.repository.BusinesscodeRepository;
import com.uusoft.test.domain.dto.TestCaseRequest;
import com.uusoft.test.domain.entity.AtpCaseEntity;
import com.uusoft.test.domain.entity.AtpEnvEntity;
import com.uusoft.test.domain.entity.AtpInterfaceEntity;
import com.uusoft.test.domain.entity.AtpSystemEntity;
import com.uusoft.test.domain.entity.BusinesscodeEntity;
import com.uusoft.test.service.AtpCaseService;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/21 17:25
 */
@Service
public class AtpCaseServiceImpl implements AtpCaseService {

  private static Logger logger = LoggerFactory.getLogger(AtpCaseServiceImpl.class);

  @Resource
  private AtpInterfaceRepository atpInterfaceRepository;
  @Resource
  private AtpSystemRepository atpSystemRepository;
  @Resource
  private AtpEnvRepository atpEnvRepository;
  @Resource
  private BusinesscodeRepository businesscodeRepository;
  @Resource
  private AtpCaseRepository atpCaseRepository;

  @Override
  public AtpCaseEntity creatCase(@NotNull TestCaseRequest testCaseRequest) {

    AtpCaseEntity atpCase = new AtpCaseEntity();

    AtpInterfaceEntity atpInterface = atpInterfaceRepository
        .findByInterfaceId(testCaseRequest.getInterfaceId());

    AtpSystemEntity atpSystem = atpSystemRepository
        .findBySystemId(testCaseRequest.getSystemId());

    BusinesscodeEntity businesscode = businesscodeRepository
        .findByBusinesscodeId(testCaseRequest.getBusinesscodeId());

    AtpEnvEntity env = atpEnvRepository.findByEnvId(testCaseRequest.getEnvId());

    atpCase.setCaseName(testCaseRequest.getCaseName());
    atpCase.setAtpInterface(atpInterface);
    atpCase.setAtpSystem(atpSystem);
    atpCase.setBusinesscode(businesscode);
    atpCase.setAtpEnv(env);
    atpCase.setCaseInfo(testCaseRequest.getCaseInfo());
    atpCase = atpCaseRepository.save(atpCase);
    return atpCase;
  }

  @Override
  public AtpCaseEntity updateCase(AtpCaseEntity atpCaseEntity) {
    return atpCaseRepository.save(atpCaseEntity);
  }

  @Override
  public void deleteCase(int caseId) {
    AtpCaseEntity atpCase = atpCaseRepository.findByCaseId(caseId);
    if (atpCase != null) {
      atpCaseRepository.delete(atpCase);
    }
  }
}
