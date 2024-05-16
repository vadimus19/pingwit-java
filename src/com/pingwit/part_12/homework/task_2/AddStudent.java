package com.pingwit.part_12.homework.task_2;

// если класс, находится в одном пакете с текущим классом, то импорт не нужен
import com.pingwit.part_12.homework.task_2.Student; //лишний импорт, удали
import com.pingwit.part_12.homework.task_2.UniversityStudents; //лишний импорт, удали

public class AddStudent {
    public static void main(String[] args) {

        Student[] initialFreshmen = new Student[]{
                Student.createStudent("Petr", "Jfa", 18),
                Student.createStudent("Ivan", "Sirko", 19),
                Student.createStudent("Bohdan", "Khmelnickij", 17)
        };

        UniversityStudents university = new UniversityStudents(initialFreshmen);

        System.out.println("----Students before adding new student:");
        printStudents(university.getFreshmen());

        Student newStudent = Student.createStudent("Vadim", "Danilchenko", 20);
        university.setFreshmen(addStudent(university.getFreshmen(), newStudent));

        System.out.println("----Students after adding new student:");
        printStudents(university.getFreshmen());
    }
    public static Student[] addStudent(Student[] students, Student newStudent) {
        Student[] updatedStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, updatedStudents, 0, students.length);
        updatedStudents[students.length] = newStudent; // лучше updatedStudents.length-1, так безопаснее
        return updatedStudents;
    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getFirstName() + ", Surname: " + student.getLastName() + ", Age: " + student.getAge()); // добавь метод toString() классу Student и тогда System.out.println(student)
        }
    }
}