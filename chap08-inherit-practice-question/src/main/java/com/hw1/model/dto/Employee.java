package com.hw1.model.dto;

public class Employee extends Person{

    private int salary;
    private String dept;

    public Employee() {
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;      // name 값은 부모 필드 값에 직접 접근해서 초기화
        this.salary = salary;
        this.dept = dept;
    }

    public String information() {
        return "Employee{" + super.information() +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
