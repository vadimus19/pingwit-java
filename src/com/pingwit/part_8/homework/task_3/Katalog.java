package com.pingwit.part_8.homework.task_3;

public class Katalog {
    private Object[] houses;

    public Katalog(Object[] houses) {
        this.houses = houses;
    }

    public void turnOnHeatingForHousesWithConditions() {
        for (Object house : houses) {
            if (house instanceof Flat) {
                Flat flat = (Flat) house;
                if (flat.getFloors() > 5 && flat.getResidents() > 10) {
                    flat.turnOnHeating();
                    System.out.println("Отопление включено в квартире с " + flat.getFloors() + " этажами и " + flat.getResidents() + " жильцами.");
                }
            } else if (house instanceof CountryHouse) {
                CountryHouse countryHouse = (CountryHouse) house;
                if (countryHouse.getFloors() > 5 && countryHouse.getResidents() > 10) {
                    countryHouse.turnOnHeating();
                    System.out.println("Отопление включено в загородном доме с " + countryHouse.getFloors() + " этажами и " + countryHouse.getResidents() + " жильцами.");
                }
            }
        }
    }
}