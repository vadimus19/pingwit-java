package com.pingwit.part_9.homework.task_2;

public class PersonMain {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Савелий", "Иванов", 18, "мужской", "single"),
                new Person("Виолетта", "Петрова", 17, "женский", "married"),
                new Person("Александр", "Сидоров", 23, "мужской", "single"),
                new Person("Елена", "Смирнова", 14, "женский", "single")
        };

        ClientDataProcessor processor = new ClientDataProcessor();

        for (Person person : people) {
            processor.processPerson(person);
        }
    }
}
