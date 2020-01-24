public class Car {
    private int numberOfDoors;
    private String name;
    private String color;
    private int numberOfPassengers;
    private double engineSize;

    public Car() {
        name = null;
        color = null;
        numberOfDoors = 0;
        numberOfPassengers = 0;
        engineSize = 0.0d;

    }

    /**
     * Creating second constructor
     * @param numberOfDoors, integer
     * @param name, String
     * @param color, String
     * @param numberOfPassengers, integer
     * @param engineSize, double
     */
    public Car(int numberOfDoors, String name, String color, int numberOfPassengers, double engineSize) {
        this.numberOfDoors = numberOfDoors;
        this.name = name;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.engineSize = engineSize;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
