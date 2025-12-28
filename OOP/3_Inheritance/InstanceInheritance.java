// Memory allocation for instance variables with default values from parent to child ---> Instance variable assigments and instance block execution sequentially for Parent class. Execution of Parent Constructor ---> Repeat the last two steps for Child class.

class Parent {
    int i = 100;
    {
        nsMethod1();
        System.out.println("P-1 Instance Block");
    }
    public Parent()
    {
        super();
        System.out.println("Parent Constructor");
    }
    public static void main(String[] args)
    {
        System.out.println("Parent main()");
        Parent p = new Parent();
    }
    public void nsMethod1()
    {
        System.out.println(j);
    }
    {
        System.out.println("P-2 Instance Block");
    }
    int j = 200;
}

public class InstanceInheritance extends Parent {
    int x = 10;
    {
        nsMethod2();
        System.out.println("C-1 Instance Block");
    }
    public InstanceInheritance()
    {
        super();
        System.out.println("Child Constructor");
    }
    public static void main(String[] args)
    {
        System.out.println("Child main()");
        InstanceInheritance c = new InstanceInheritance();
        System.out.println("Exec. back to main()");
    }
    public void nsMethod2()
    {
        System.out.println(y);
    }
    {
        System.out.println("C-2 Instance Block");
    }
    int y = 20;
}