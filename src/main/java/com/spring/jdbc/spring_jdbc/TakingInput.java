package com.spring.jdbc.spring_jdbc;

import java.util.Scanner;

public class TakingInput {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User ");
        String name=sc.nextLine();
        System.out.println("Enter City ");
        String city=sc.nextLine();
        System.out.println("Enter Your ID");
        int id=sc.nextInt();
        setCity(city);
        setName(name);
        setId(id);
    }
}
