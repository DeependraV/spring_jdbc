package com.spring.jdbc.spring_jdbc;

public class Student {
    private int id;
    private String city;
    private String name;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String city, String name) {
        this.id = id;
        this.city = city;
        this.name = name;
    }
}
