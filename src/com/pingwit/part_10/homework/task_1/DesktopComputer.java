package com.pingwit.part_10.homework.task_1;

public class DesktopComputer implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Desktop Computer is turning on.");

    }

    @Override
    public void turnOff() {
        System.out.println("Desktop Computer is turning off.");

    }

    @Override
    public void reset() {
        System.out.println("Desktop Computer is resetting.");

    }
}
