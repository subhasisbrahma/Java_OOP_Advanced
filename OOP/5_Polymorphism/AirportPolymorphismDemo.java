// Advantage of Polymorphic method arguments

class Plane {
    public void takeOff() {
        System.out.println("Plane is taking off");
    }
    public void land() {
        System.out.println("Plane is landing");
    }
    public void fly() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane {
    public void takeOff() {
        System.out.println("CP is taking off from a long-sized runway");
    }

    public void land() {
        System.out.println("CP is landing on a long-sized runway");
    }

    public void fly() {
        System.out.println("CP is flying at a lower height");
    }
}

class PassengerPlane extends Plane {
    public void takeOff() {
        System.out.println("PP is taking off from a medium-sized runway");
    }
   
    public void land() {
        System.out.println("PP is landing on a medium-sized runway");
    }
   
    public void fly() {
        System.out.println("PP is flying at a medium height");
    }
}

class FighterPlane extends Plane {
    public void takeOff() {
        System.out.println("FP is taking off from a short-sized runway");
    }
   
    public void land() {
        System.out.println("FP is landing on a short-sized runway");
    }
   
    public void fly() {
        System.out.println("FP is flying at a greater height");
    }
}

class Airport {
    public void permit(Plane ref) { // Polymorphic Method: Accepts any Child object of Plane
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}


public class AirportPolymorphismDemo {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();

        // One method call for different types of objects
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}
