package com.pingwit.part_25.homework.task_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarsSortedByEngine {
    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars(2008, "Toyota", "Electric"));
        cars.add(new Cars(2022, "Tesla", "Electric"));
        cars.add(new Cars(2008, "Acura", "Petrol"));
        cars.add(new Cars(2008, "Audi", "Diesel"));

        Map<String, List<Cars>> carsByEngine = cars.stream()
                .collect(Collectors.groupingBy(Cars::engineType));
        carsByEngine.forEach((engine, carList) -> {
            System.out.println("Engine type: " + engine);

        });
    }
}
