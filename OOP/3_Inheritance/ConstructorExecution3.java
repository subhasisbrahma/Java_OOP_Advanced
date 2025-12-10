// CASE-3: If the parameterized constructor of the parent class must be invoked
//         from the child class constructor, then super(arguments) should be invoked explicitly.

class Demo1 {
    int a;
    int b;

    public Demo1() {
        //super();
        a = 10;
        b = 20;
    }

    public Demo1(int i, int j) {
        //super();
        a = i;
        b = j;
    }
}

class Demo2 extends Demo1 {
    
    int c;
    int d;

    public Demo2() {
        //super();
        c = 30;
        d = 40;
    }

    public Demo2(int m, int n) {
        super(m,n); //explicitly invoked
        c = m;
        d = n; 
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class ConstructorExecution3 {
    public static void main(String[] args) {

        Demo2 d2 = new Demo2(100,200); 
        d2.disp();
    }
}

// super() or this() must always be the first statement within a constructor. 
// This prevents accessing uninitialized parent members.
