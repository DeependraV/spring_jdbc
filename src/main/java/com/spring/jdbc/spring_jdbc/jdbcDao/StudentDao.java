package com.spring.jdbc.spring_jdbc.jdbcDao;

import com.spring.jdbc.spring_jdbc.Student;
import com.spring.jdbc.spring_jdbc.jdbcDaoImpl.StudentDaoImpl;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao implements StudentDaoImpl {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDao() {
    }

    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Student student) {
        String query="insert into student(id,name,city) values(?,?,?)";
        int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        String query="update student set city='"+student.getCity()+"',name='"+student.getName()+"' where id='"+student.getId()+"' ";
        int result=this.jdbcTemplate.update(query);
        return result;
    }

    @Override
    public int delete(Student student) {
        String query="delete from student where id=? ";
        int result= jdbcTemplate.update(query,student.getId());
        return result;
    }
}
