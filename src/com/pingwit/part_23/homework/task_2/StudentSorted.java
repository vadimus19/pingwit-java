package com.pingwit.part_23.homework.task_2;

import java.util.Set;
import java.util.TreeSet;

public class StudentSorted {
    public static void main(String[] args) {
        Set<StudentList> studentLists = new TreeSet<>();
        studentLists.add(new StudentList("Gosha", "Pupkin", 2));
        studentLists.add(new StudentList("Vadimus", "Vel", 2));
        studentLists.add(new StudentList("Ola", "Vel", 4));
        studentLists.add(new StudentList("Bob", "Marlie", 1));
        {
            for (StudentList student : studentLists) {
                System.out.println(student);
            }
//            решил попробовать форич и стрим
            
            System.out.println("======");
            {
                studentLists.stream()
                        .forEach(System.out::println);
            }
        }
    }
}
