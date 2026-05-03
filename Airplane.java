package fields;
import java.util.Objects;

public class Airplane {
    private String model;
    private int passengerCapacity;
    private int maxSpeed;
    private int flightRange;
    private int yearOfManufacture;

    public Airplane(String model, int passengerCapacity, int maxSpeed, int flightRange, int yearOfManufacture) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.maxSpeed = maxSpeed;
        this.flightRange = flightRange;
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getModel() {
        return model;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getFlightRange() {
        return flightRange;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return passengerCapacity == airplane.passengerCapacity &&
                maxSpeed == airplane.maxSpeed &&
                flightRange == airplane.flightRange &&
                yearOfManufacture == airplane.yearOfManufacture &&
                Objects.equals(model, airplane.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, passengerCapacity, maxSpeed, flightRange, yearOfManufacture);
    }
    @Override
    public String toString() {
        return model + " " + passengerCapacity + " " + maxSpeed + " " + flightRange + " " + yearOfManufacture;
    }
}

