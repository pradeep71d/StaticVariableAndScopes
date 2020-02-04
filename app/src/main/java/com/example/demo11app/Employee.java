package com.example.demo11app;

public class Employee {
    int empid;
    String name;
    static String company="alexter world";
//here we are making company static so that we can share company for both objects e1,e2;
// becoz company is same variable used for both objects,so we can declare it with static keyword
//and in this way we can understand that static variable provides memory management
    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
    void display(){
        System.out.println(empid+"\t"+name+"\t"+company);
    }
}
