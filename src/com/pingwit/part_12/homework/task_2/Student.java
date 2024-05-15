package com.pingwit.part_12.homework.task_2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    private Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static Student createStudent(String firstName, String lastName, int age) {
        return new Student(firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
}
