
abstract class Vehicle {
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    
    public abstract void start();

    // Method Overriding
    @Override
    public String toString() {
        return "Vehicle: " + name + ", Type: " + type;
    }
}


class Car extends Vehicle {
    private String model;

    public Car(String name, String model) {
        super(name, "Car");
        this.model = model;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println(getName() + " model " + model + " is starting.");
    }

    // Method Overloading
    public void start(String mode) {
        System.out.println(getName() + " model " + model + " is starting in " + mode + " mode.");
    }
}


class Bike extends Vehicle {
    private String model;

    public Bike(String name, String model) {
        super(name, "Bike");
        this.model = model;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println(getName() + " model " + model + " is revving up.");
    }

    // Method Overloading
    public void start(boolean electric) {
        if (electric) {
            System.out.println(getName() + " model " + model + " is starting loudly.");
        } else {
            start();
        }
    }
}


public class OOP_Task {
    public static void main(String[] args) {
        
        Car myCar = new Car("Ferrari Roma", "2023");
        Bike myBike = new Bike("Ducati", "Panigale V2");       
        Vehicle[] vehicles = { myCar, myBike };        
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.start();
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.start("sports");
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                bike.start(true);
            }
            System.out.println();
        }
    }
}
