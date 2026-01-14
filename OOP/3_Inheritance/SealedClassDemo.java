// Parent class restricts inheritance to only Car, Truck, and Bike
sealed class Vehicle permits Car, Truck, Bike {
    void disp() {
        System.out.println("This is a generic Vehicle.");
    }
}

// Inheritance is prevented using "final"
final class Car extends Vehicle {
    void carDisp() {
        System.out.println("Car is a Vehicle.");
    }
}

// Restricts inheritance further to a specific subclass using "sealed"
sealed class Truck extends Vehicle permits MiniTruck {
    void truckDisp() {
        System.out.println("Truck is a Vehicle.");
    }
}

final class MiniTruck extends Truck {
    void miniDisp() {
        System.out.println("MiniTruck is a smaller Truck.");
    }
}

// Opens the class for unrestricted inheritance using "non-sealed"
non-sealed class Bike extends Vehicle {
    void bikeDisp() {
        System.out.println("Bike is a Vehicle.");
    }
}

// This is not allowed as the Vehicle class is sealed and doesnot permit the Bicycle class to inherit
//class Bicycle extends Vehicle {
//} 

public class SealedClassDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.disp();    // Inherited from vehicle
        c.carDisp(); // Specialized

        MiniTruck mt = new MiniTruck();
        mt.disp();      // Inherited from Vehicle
        mt.truckDisp(); // Inherited from Truck
        mt.miniDisp();  // Specialized

        Bike b = new Bike();
        b.disp();        // Inherited from Vehicle
        b.bikeDisp();    // Specialized
    }
}