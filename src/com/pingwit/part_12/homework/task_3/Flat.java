package com.pingwit.part_12.homework.task_3;

public class Flat {
    private String doorPasscode = "1648";

    private void doorPasscode(String passcode) {
        if (passcode.equals(doorPasscode)) {
            System.out.println("The door is opened");
        } else {
            System.out.println("Wrong password.The door is close");
        }
    }

    void openDoor() {

        System.out.println("<<The door is open!Do not forget your keys anymore!!!>>");
    }
}
