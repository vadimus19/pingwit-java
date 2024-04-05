package homework.task_1;

public class Car {
    String model = model;
    String marka = marka;
    int numDoors = numDoors;

    public Car(String model, String marka, int numDoors) {

        this.model = model;
        this.marka = marka;
        this.numDoors = numDoors;

    }

    public Car() {
        this("X5", "BMW", 4);
        this("Mazda", "RX6", 2);
        this("audi", "A8", 4);


        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getMarka () {
            return marka;
        }

        public void setMarka (String marka){
            this.marka = marka;
        }

        public int getNumDoors () {
            return numDoors;
        }

        public void setNumDoors ( int numDoors){
            this.numDoors = numDoors;
        }

        @Override
        public String toString () {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", marka='" + marka + '\'' +
                    ", numDoors=" + numDoors +
                    '}';
        }
    }
