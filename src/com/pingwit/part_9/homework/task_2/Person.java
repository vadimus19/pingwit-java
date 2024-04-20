package com.pingwit.part_9.homework.task_2;

public class Person {
    String firstName;
    String lastName;
    int age; // Возраст, а не год рождения
    String gender;
    String maritalStatus;

    public Person(String firstName, String lastName, int age, String gender, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}

