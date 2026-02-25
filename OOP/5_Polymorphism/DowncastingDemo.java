//Downcasting refers to the process of temporarily converting Parent-type reference to Child-type so that the specialized methods of the child class can be accessed.

class Parent{
    public void cry(){
        System.out.println("Parent do not cry");
    }
}

class Child1 extends Parent{
    public void cry(){
        System.out.println("Child 1 cries with low voice");
    }
    public void eat(){
        System.out.println("Child 1 eats less food");
    }
}

class Child2 extends Parent{
    public void cry(){
        System.out.println("Child 2 cries with moderate voice");
    }
    public void eat(){
        System.out.println("Child 2 eats moderate food");
    }
}

class Child3 extends Parent{
    public void cry(){
        System.out.println("Child 3 cries with loud voice");
    }
    public void eat(){
        System.out.println("Child 3 eats more food");
    }
}

public class DowncastingDemo {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        
        Parent ref;

        ref = c1;
        ref.cry();
        ((Child1)(ref)).eat(); //downcasting

        ref = c2;
        ref.cry();
        ((Child2)(ref)).eat(); //downcasting

        ref = c3;
        ref.cry();
        ((Child3)(ref)).eat(); //downcasting
    }
}
