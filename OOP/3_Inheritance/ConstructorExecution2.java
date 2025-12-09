// CASE-2: Whenever a parameterized/zero-parameterized constructor of the child class is
//         invoked, it is always the zero-parameterized constructor of the parent class that
//         will be invoked implicitly.

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
        //super();
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

public class ConstructorExecution2 {
    public static void main(String[] args) {

        Demo2 d2 = new Demo2(100,200); 
        d2.disp();
    }
}
