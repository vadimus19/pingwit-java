package com.pingwit.part_12.homework.task_3;

public class Flat {
    private String doorPasscode = "1648";

    private void doorPasscode(String passcode) { // doorPasscode -> openDoor, у методов могут быть одинаковые название, если отличаются аргументы
        if (passcode.equals(doorPasscode)) {
            System.out.println("The door is opened"); // Вызови здесь метод openDoor()
        } else {
            System.out.println("Wrong password.The door is close");
        }
    }

    void openDoor() { // этот метод тоже должен быть приватным, ты будешь его вызывать через reflection
// лишняя строка, удали
        System.out.println("<<The door is open!Do not forget your keys anymore!!!>>"); // is open -> is opened
    }
}
