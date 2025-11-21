import java.util.Scanner;

class Farmer {
    private float p;    // principal amount
    private float t;    // time duration
    private float s_i; // simple interest result

    static private float r; // rate of interest
    static {
        r = 2.5f;
    }

    public void acceptInput() { // Non-Static Method
        Scanner scan = new Scanner(System.in); // Assuming Scanner is imported
        
        System.out.println("Enter the principle amount");
        p = scan.nextFloat();
        
        System.out.println("Enter Time Duration");
        t = scan.nextFloat();
    }

    public void compute() { // Non-Static Method
        s_i = (p * t * r) / 100; // Calculation uses both types of variables
    }
    
    public void disp() { // Non-Static Method
        System.out.println("The Simple Interest is: " + s_i);
    }
    
    public static void checkEligibility() { // Static Method

        System.out.println("The applicant amount must be between 18 & 70 years"); // Sample eligibility check
    }
}

public class FarmerApp {
    public static void main(String[] args) {
        
        Farmer.checkEligibility(); // Static method called via Class Name (JVM loads Farmer class).

        // Creating three different objects
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();
        
        // Object f1 workflow
        f1.acceptInput();
        f1.compute();
        f1.disp();
        
        // Object f2 workflow
        f2.acceptInput();
        f2.compute();
        f2.disp();

        // Object f3 workflow
        f3.acceptInput();
        f3.compute();
        f3.disp();
    }
}
