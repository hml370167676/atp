package com.uusoft.test.manager;

import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/22 16:48
 */

@Service
public interface RunCaseManager {

  /**
   * 单个用例执行
   */
  void singleCase();

  /**
   * 批量用例执行
   */
  void batchCase();

  /**
   * 流程用例执行
   */
  void flowCase();




}
