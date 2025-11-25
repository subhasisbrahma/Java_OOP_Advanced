class Demo1 { // Parent Class
    void disp1() {
        System.out.println("Learn from leaders");
    }
}

class Demo2 extends Demo1 { // Child Class
    void disp2() {
        System.out.println("Pioneering Edutainment");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(); // Object of the Child Class
        
        // Calling methods
        d2.disp2(); // Calling Child's method
        d2.disp1(); // Calling Inherited Parent's method
        
    }
}