package com.spring.jdbc.spring_jdbc.jdbcDao;

import com.spring.jdbc.spring_jdbc.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
    public  Student getStudent(int studentID);
    public List<Student> getAllStudent();

}
