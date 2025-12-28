//Variable hiding occurs when a child class defines a variable with the same name as it's parent, preventing direct access to the parent's variable unless accessed via "super". Variable resolution is based on the reference type at compile-time.

class Demo1{ 
    int i = 9;
    void disp(){
        System.out.println("XYZ");
    }
}
class Demo2 extends Demo1 {
    int i = 99;
    void disp() {
        int i = 999;
        System.out.println(i); 
        System.out.println(this.i);  
        System.out.println(super.i); 
        System.out.println("ABC");
        super.disp();
    }
}
public class VariableHidingDemo {
    public static void main(String[] args){
        Demo2 d2 = new Demo2();
        d2.disp();
    }
}
