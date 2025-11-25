class Demo1 { 
    void disp1() {
        System.out.println("X");
    }
}

class Demo2 extends Demo1 { 
    void disp2() {
        System.out.println("Y");
    }
}

class Demo3 extends Demo2 { 
    void disp3() {
        System.out.println("Z");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3(); // Object of the Final Child
        
        d3.disp3();
        d3.disp2(); 
        d3.disp1(); 
        
    }
}