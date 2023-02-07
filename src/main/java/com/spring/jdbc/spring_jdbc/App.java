package com.spring.jdbc.spring_jdbc;

import com.spring.jdbc.spring_jdbc.config.config;
import com.spring.jdbc.spring_jdbc.jdbcDaoImpl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
        StudentDaoImpl sdao=(StudentDaoImpl) context.getBean("sdao1");
//        TakingInput input=new TakingInput();
//        input.getData();
//        Student student=new Student(input.getId(),input.getCity(),input.getName());
//        int result=sdao.insert(student);
       // int result=sdao.change(student);
       // int result=sdao.delete(student);
        List<Student> students= sdao.getAllStudent();
        System.out.println("result is "+students);
    }
}