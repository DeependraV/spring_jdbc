package com.spring.jdbc.spring_jdbc.config;

import com.spring.jdbc.spring_jdbc.jdbcDaoImpl.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.spring_jdbc.jdbcDaoImpl")
public class config {
    @Bean("ds")
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("9424934024");
        return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("sdao1")
//    public StudentDaoImpl getStudentDaoImpl()
//    {
//        StudentDaoImpl studentDao=new StudentDaoImpl();
//        studentDao.setJdbcTemplate(getJdbcTemplate());
//        return studentDao;
//    }


}
