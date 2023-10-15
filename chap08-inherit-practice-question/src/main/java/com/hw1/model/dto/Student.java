package com.hw1.model.dto;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;      // name 값은 부모 필드 값에 직접 접근해서 초기화
        this.grade = grade;
        this.major = major;
    }

    public String information() {
        return "Student{" + super.information() +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
