package com.lyn.order.service.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.lyn.order.service.mapper",sqlSessionFactoryRef="mysqlSqlSessionFactory")
public class MysqlConfig {

    @Value("${mysql.datasource.url}")
    private String url;

    @Value("${mysql.datasource.username}")
    private String username;

    @Value("${mysql.datasource.password}")
    private String password;

    @Value("${mysql.datasource.driverclass}")
    private String driverclass;

    @Primary
    @Bean(name = "mysqldatasouce")
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverclass);
        datasource.setInitialSize(5);
        datasource.setMinIdle(5);
        datasource.setMaxActive(50);
        datasource.setMaxWait(60000);
        datasource.setTimeBetweenEvictionRunsMillis(60000);
        datasource.setMinEvictableIdleTimeMillis(300000);
        datasource.setValidationQuery("SELECT 'x'");
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(false);
        datasource.setTestOnReturn(false);
        //数据库连接池不能正常关闭添加的改动
        datasource.setRemoveAbandoned(true);
        datasource.setRemoveAbandonedTimeout(180);
        datasource.setLogAbandoned(true);
        return datasource;
    }

    @Primary
    @Bean(name = "mysqlSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:/mapping/*.xml"));
        return factoryBean.getObject();
    }

}
