package com.uusoft.test.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p>Description: DruidDBConfig类被@Configuration标注，用作配置信息； DataSource对象被@Bean声明，为Spring容器所管理，@Primary表示
 * 这里定义的DataSource将覆盖其他来源的DataSource。 jdbc.url=${jdbc.url} 最新的支持方式如下: jdbc.url=@jdbc.url@  </p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2018/3/14 14:41
 */
@Configuration
public class DruidDBConfig {

  private final static Logger Logger = LoggerFactory.getLogger(DruidDBConfig.class);

  @Value("${spring.datasource.url}")
  private String dbUrl;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.driverClassName}")
  private String driverClassName;

  @Value("${spring.datasource.initialSize}")
  private int initialSize;

  @Value("${spring.datasource.minIdle}")
  private int minIdle;

  @Value("${spring.datasource.maxActive}")
  private int maxActive;

  @Value("${spring.datasource.maxWait}")
  private int maxWait;

  @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
  private int timeBetweenEvictionRunsMillis;

  @Value("${spring.datasource.minEvictableIdleTimeMillis}")
  private int minEvictableIdleTimeMillis;

  @Value("${spring.datasource.validationQuery}")
  private String validationQuery;

  @Value("${spring.datasource.testWhileIdle}")
  private boolean testWhileIdle;

  @Value("${spring.datasource.testOnBorrow}")
  private boolean testOnBorrow;

  @Value("${spring.datasource.testOnReturn}")
  private boolean testOnReturn;

  @Value("${spring.datasource.poolPreparedStatements}")
  private boolean poolPreparedStatements;

  @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
  private int maxPoolPreparedStatementPerConnectionSize;

  @Value("${spring.datasource.filters}")
  private String filters;

  @Value("{spring.datasource.connectionProperties}")
  private String connectionProperties;

  @Value("{spring.datasource.initialization-mode}")
  private String initialize;

  @Bean
  @Primary //在相同的DataSrouce中，首先使用被标注的DataSource 主数据源
  public DataSource dataSource() {
    DruidDataSource dataSource = new DruidDataSource();

    dataSource.setUrl(dbUrl);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    dataSource.setDriverClassName(driverClassName);

    // configuration
    dataSource.setInitialSize(initialSize);
    dataSource.setMinIdle(minIdle);
    dataSource.setMaxActive(maxActive);
    dataSource.setMaxWait(maxWait);
    dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    dataSource.setValidationQuery(validationQuery);
    dataSource.setTestWhileIdle(testWhileIdle);
    dataSource.setTestOnBorrow(testOnBorrow);
    dataSource.setTestOnReturn(testOnReturn);
    dataSource.setPoolPreparedStatements(poolPreparedStatements);
    dataSource
        .setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
    try {
      dataSource.setFilters(filters);
    } catch (SQLException e) {

    }

    dataSource.setConnectionProperties(connectionProperties);
    Logger.info("数据库配置信息：{}", dataSource.toString());
    return dataSource;
  }

}
