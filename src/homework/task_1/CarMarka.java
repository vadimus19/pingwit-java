package homework.task_1;

public class CarMarka {
    public void main(String[] args, String CarMarka) {

        Car car1 = new Car();
        car1.setModel("X3");
        car1.setMarka("BMW");
        car1.setNumDoors(4);


        Car car2 = new Car();
        car2.setModel("RX5");
        car2.setMarka("Mazda");
        car2.setNumDoors(2);

        Car car3 = new Car();
        car3.setModel("A8");
        car3.setMarka("Audi");
        car3.setNumDoors(4);

        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            if (car.getMarka() == ("Audi")) {
                System.out.println("Opening doors for Audi " + car.getModel() + ":");

            }
        }
    }
}





