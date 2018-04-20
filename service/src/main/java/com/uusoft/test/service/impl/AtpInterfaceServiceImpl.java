package com.uusoft.test.service.impl;

import com.uusoft.test.dao.repository.AtpInterfaceRepository;
import com.uusoft.test.domain.entity.AtpInterfaceEntity;
import com.uusoft.test.service.AtpInterfaceService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/21 11:05
 */
@Service
public class AtpInterfaceServiceImpl implements AtpInterfaceService {

  @Resource
  private AtpInterfaceRepository atpInterfaceRepository;

  @Override
  public AtpInterfaceEntity creatInterface() {

    return null;
  }
}
