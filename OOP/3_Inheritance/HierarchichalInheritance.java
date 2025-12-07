class Demo1 { 
    void disp1() {
        System.out.println("A");
    }
}

class Demo2 extends Demo1 { 
    void disp2() {
        System.out.println("X");
    }
}

class Demo3 extends Demo1 { 
    void disp3() {
        System.out.println("Y");
    }
}

class Demo4 extends Demo1 { 
    void disp4() {
        System.out.println("Z");
    }
}

public class HierarchichalInheritance {
    public static void main(String[] args) {
         Demo2 d2 = new Demo2();
         d2.disp2();
         d2.disp1();

         Demo3 d3 = new Demo3();
         d3.disp3();
         d3.disp1();

         Demo4 d4 = new Demo4();
         d4.disp4();
         d4.disp1();
        
    }
}
