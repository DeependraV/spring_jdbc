package com.spring.jdbc.spring_jdbc.jdbcDaoImpl;

import com.spring.jdbc.spring_jdbc.Student;
import com.spring.jdbc.spring_jdbc.jdbcDao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("sdao1")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDaoImpl() {
    }

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
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

    @Override
    public Student getStudent(int studentID) {
        //select single student data
        String query="select * from student where id=?";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        Student student= jdbcTemplate.queryForObject(query,rowMapper,studentID);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String query="select * from student";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        List<Student> student= (List<Student>) jdbcTemplate.query(query,rowMapper);
        return (List<Student>) student;
    }
}
