package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        if (person.age >= 18 && person.maritalStatus.equals("single")) {
            if (person.gender.equals("мужской")) {
                System.out.println("Уважаемый " + person.firstName + ", желаете ли познакомиться с девушкой?");
            } else if (person.gender.equals("женский")) {
                System.out.println("Уважаемая " + person.firstName + ", мы поможем вам найти мужчину мечты!");
            }
        } else if (person.age < 18) {
            System.out.println("Уважаемый(ая) " + person.firstName + ", учи уроки!");
        }
    }
}

