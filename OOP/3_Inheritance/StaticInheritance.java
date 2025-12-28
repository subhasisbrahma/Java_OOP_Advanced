//Memory allocation with default values for static variables, static variable assignments and static block execution sequentially for the Parent Class ---> Same for the Child class ---> Execution of main() method for child class.

class Parent {
    static int i = 100;
    static
    {
        sMethod1();
        System.out.println("P-1 Static Block");
    }
    public static void main(String[] args)
    {
        System.out.println("Parent main()");
        sMethod1();
    }
    public static void sMethod1()
    {
        System.out.println(j);
    }
    static
    {
        System.out.println("P-2 Static Block");
    }
    static int j = 200;
}

class StaticInheritance extends Parent {
    static int x = 10;
    static
    {
        sMethod2();
        System.out.println("C-1 Static Block");
    }
    public static void main(String[] args)
    {
        System.out.println("Child main()");
        sMethod2();
    }
    public static void sMethod2()
    {
        System.out.println(y);
    }
    static
    {
        System.out.println("C-2 Static Block");
    }
    static int y = 20;
}

