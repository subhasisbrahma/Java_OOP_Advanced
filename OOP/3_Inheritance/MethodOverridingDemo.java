class Plane {
    public void takeoff() {
        System.out.println("Plane is taking off.");
    }
    public void fly() {
        System.out.println("Plane is flying.");
    }
    public void land() {
        System.out.println("Plane is landing.");
    }
}

class CargoPlane extends Plane {
    
    public void fly() { // Overridden method
        System.out.println("Cargo Plane is flying at lower height.");
    }
    
    public void carryCargo() { // Specialized method
        System.out.println("Cargo Plane is carrying goods.");
    }
}

class PassengerPlane extends Plane {
    
    public void fly() { // Overridden method
        System.out.println("Passenger Plane is flying at medium height.");
    }
    
    public void carryPassenger() { // Specialized method
        System.out.println("Passenger Plane is carrying passengers.");
    }
}

class FighterPlane extends Plane {
    
    public void fly() { // Overridden method
        System.out.println("Fighter Plane is flying at higher height.");
    }
    
    public void carryWeapons() { // Specialized method
        System.out.println("Fighter Plane is carrying weapons.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.carryCargo();   
        cp.takeoff();       
        cp.fly();          
        cp.land();          
        
        pp.carryPassenger();
        pp.takeoff();       
        pp.fly();        
        pp.land();  

        fp.carryWeapons();
        fp.takeoff();   
        fp.fly();  
        fp.land(); 
    }
}
