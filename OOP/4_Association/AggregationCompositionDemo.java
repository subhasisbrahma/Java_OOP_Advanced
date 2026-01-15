// Composition: A tightly-bound "has-a" relationship. When the enclosing (container) object is destroyed, the contained object is also destroyed.
// Aggregation: A loosely-bound "has-a" relationship. When the enclosing object is destroyed, the contained object still remains accessible.

class OperatingSystem { //Composite Class
    private String name;
    private int size;

    public OperatingSystem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { 
        return name; 
    }
    public int getSize() { 
        return size; 
    }
}

class Charger { //Aggregate Class
    private String brand;
    private int voltage;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() { 
        return brand; 
    }
    public int getVoltage() { 
        return voltage; 
    }
}

class Mobile {
    // Composition: OS is created during Mobile creation
    OperatingSystem os = new OperatingSystem("Android", 512);
    
    // Aggregation: Charger is passed later via setter
    private Charger c;

    public void setCharger(Charger c) {
        this.c = c;
    }

    public OperatingSystem getOS() { 
        return os; 
    }
    public Charger getCharger() { 
        return c; 
    }
}

public class AggregationCompositionDemo {
    public static void main(String[] args) {
        Charger ch = new Charger("Samsung", 120);
        Mobile m = new Mobile();
        
        m.setCharger(ch);
        
        System.out.println(m.getOS().getName());    // Output: Android
        System.out.println(m.getOS().getSize());    // Output: 512
        System.out.println(m.getCharger().getBrand()); // Output: Samsung
        System.out.println(m.getCharger().getVoltage()); // Output: 120
        
        // Destroying the main object. The reference "m" no more points to the old one.
        m = null; 
        
        // System.out.println(m.getOS().getName()); // This would cause NullPointerException
        
        // Aggregated object still exists!
        System.out.println(ch.getBrand());   // Output: Samsung
        System.out.println(ch.getVoltage()); // Output: 120
    }
}