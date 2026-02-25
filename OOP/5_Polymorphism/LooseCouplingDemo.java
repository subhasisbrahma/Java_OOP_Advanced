// Loose Coupling via Upcasting refers to the process of creating parent-type reference to child-type objects.

class Parent{
    public void cry(){
        System.out.println("Parent do not cry");
    }
}

class Child1 extends Parent{
    public void cry(){
        System.out.println("Child 1 cries with low voice");
    }
}

class Child2 extends Parent{
    public void cry(){
        System.out.println("Child 2 cries with moderate voice");
    }
}

class Child3 extends Parent{
    public void cry(){
        System.out.println("Child 3 cries with loud voice");
    }
}

public class LooseCouplingDemo {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        
        Parent ref;

        ref = c1; //Upcasting
        ref.cry();

        ref = c2; //Upcasting
        ref.cry();

        ref = c3; //Upcasting
        ref.cry();
    }
}
