package com.pingwit.part_10.homework.task_2;

public class Car implements Vehicle {
    private Engine engine;
    private Gearbox gearbox;
    private boolean isRunning;

    public Car() {
        engine = new Engine();
        gearbox = new Gearbox();
        isRunning = false;
    }

    @Override
    public void startEngine() {
        if (!engine.isRunning()) {
            engine.start();
            isRunning = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    @Override
    public void stopEngine() {
        if (engine.isRunning()) {
            engine.stop();
            isRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    @Override
    public void shiftUp() {
        if (isRunning) {
            gearbox.shiftUp();
            System.out.println("Shifted up to gear " + gearbox.getCurrentGear());
        } else {
            System.out.println("Cannot shift gear, engine is not running.");
        }
    }

    @Override
    public void shiftDown() {
        if (isRunning) {
            gearbox.shiftDown();
            System.out.println("Shifted down to gear " + gearbox.getCurrentGear());
        } else {
            System.out.println("Cannot shift gear, engine is not running.");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            int speed = gearbox.getCurrentGear() * 20;
            System.out.println("Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate, engine is not running.");
        }
    }
}
