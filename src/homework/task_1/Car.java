package homework.task_1;

public class Car {
    private String model;
    private String marka;
    private int numDoors;

    public Car(String marka, String model, int numDoors) {
        this.marka = marka;
        this.model = model;
        this.numDoors = numDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }
}
