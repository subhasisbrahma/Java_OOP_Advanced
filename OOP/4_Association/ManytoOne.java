// many-to-one : This relationship occurs when multiple objects of one entity (e.g. Employee) are mapped to a single object of another entity (e.g. Branch).

class Branch { // Dependent class
    private int bId;
    private String bLoc;

    public Branch(int bId, String bLoc) {
        this.bId = bId;
        this.bLoc = bLoc;
    }

    public int getBId() {
        return bId;
    }

    public String getBLoc() {
        return bLoc;
    }
}

class Employee { // Target class
    private int empId;
    private String empName;
    
    // Has-A variable
    private Branch branch;

    public Employee(int empId, String empName, Branch branch) {
        this.empId = empId;
        this.empName = empName;
        this.branch = branch;
    }

    public void disp() {
        System.out.println("Employee Details:");
        System.out.println("Emp Id: " + empId);
        System.out.println("Emp Name: " + empName);
        System.out.println("Branch Details:");
        System.out.println("Branch Id: " + branch.getBId());
        System.out.println("Branch Loc: " + branch.getBLoc());
    }
}


public class ManytoOne {
    public static void main(String[] args) {
        // Creating of the single Dependent Object
        Branch br = new Branch(99, "Bengaluru");

        // Creating multiple Target Objects using the same Branch
        Employee emp1 = new Employee(01, "Sachin", br);
        Employee emp2 = new Employee(02, "Virat", br);
        Employee emp3 = new Employee(03, "Rohit", br);

        emp1.disp();
        emp2.disp();
        emp3.disp();
    }
}