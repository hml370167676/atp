package com.uusoft.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/14 11:50
 */
@SpringBootApplication
@ServletComponentScan
@EnableJpaRepositories(basePackages = "com.uusoft.test.dao")
@EntityScan(basePackages = "com.uusoft.test.domain")
public class Application {

  private static Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    logger.info("ATP Application 启动成功");
  }

}
