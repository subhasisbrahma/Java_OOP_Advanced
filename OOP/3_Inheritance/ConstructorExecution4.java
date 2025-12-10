// CASE-4: If the constructor of a class intends to invoke another constructor of the 
//         same class, then 'this()' call must be used.

class Demo1 {
    int a;
    int b;

    public Demo1() {
        //super();
        a = 100;
        b = 200;
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

    public Demo2(int x, int y) {
        super(x,y); //explicitly invoked
        c = x;
        d = y; 
    }

    public Demo2(int m, int n, int o, int p){
        this(m,n); // Calls the two-arg constructor of the SAME class
        c = o;
        d = p;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class ConstructorExecution4 {
    public static void main(String[] args) {

        Demo2 d2 = new Demo2(10,20,30,40);
        d2.disp();
    }
}
