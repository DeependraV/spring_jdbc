package com.spring.jdbc.spring_jdbc.jdbcDaoImpl;

import com.spring.jdbc.spring_jdbc.Student;

public interface StudentDaoImpl {

    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
}
