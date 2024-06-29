package com.pingwit.part_20.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Garage<t extends Car> {
    private List<t> cars;
    public Garage() {
        cars = new ArrayList<>();
    }
    public void park(t car) {
        cars.add(car);
    }
    public List<t> getCars() {
        return cars;
    }
    public long countBlackCars() {
        return cars.stream().filter(car -> "Black".equalsIgnoreCase(car.getColor())).count();
    }
}
