class InstanceControlFlow {
    static int a = 10, b = 20, c = 30;  // Static Variables

    static { // Static Block
        System.out.println("Inside Static Block");
        a = 100;
        b = 200;
        c = 300;
    }

    public static void disp1() { // Static Method
        System.out.println("Inside Static Method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    int x = 40, y = 50, z = 60; // Instance (Non-Static) Variables
    

    { // Instance Block (Non-Static Block)
        System.out.println("Inside non-static Block");
        x = 45;
        y = 55;
        z = 65;
    }
    
    public void disp2() { // Instance (Non-Static) Method
        System.out.println("Inside non-static method");
        System.out.println(a); // Accessing static variable
        System.out.println(b);
        System.out.println(c);
        System.out.println(x); // Accessing instance variable
        System.out.println(y);
        System.out.println(z);
    }

    public InstanceControlFlow() {  // Constructor
        System.out.println("Inside Constructor");
        x = 400;
        y = 500;
        z = 600;
    }

    public static void main(String[] args) {
        System.out.println("Inside main() method");
        
        disp1(); // Calling the static method directly

        InstanceControlFlow i1 = new InstanceControlFlow();
        i1.disp2();
        
        InstanceControlFlow i2 = new InstanceControlFlow();
        i2.disp2();
        i2.disp1();
    }
}
