package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        if (person.getAge() >= 18 && person.getMaritalStatus() == MaritalStatus.SINGLE) {
            if (person.getGender() == Gender.MALE) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            } else if (person.getGender() == Gender.FEMALE) {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            }
        } else if (person.getAge() < 18) {
            System.out.println("Уважаемый(ая) " + person.getFirstName() + ", учи уроки!");
        }
    }
}

