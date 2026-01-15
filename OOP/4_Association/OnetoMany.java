// one-to-many association : This is a relationship between two entities where one object of one entity is mapped to many objects of another entity.

class Employee { // Dependent Class
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Department { // Target Class
    private int deptId;
    private String deptName;
    private String deptLoc;
    
    // Has-A variable (Reference to multiple dependent objects via an array)
    private Employee[] employees; 

    // Constructor Injection of the dependent Employee array
    public Department(int deptId, String deptName, String deptLoc, Employee[] employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptLoc = deptLoc;
        this.employees = employees;
    }

    public void disp() {
        System.out.println("Department Details:");
        System.out.println(deptId);
        System.out.println(deptName);
        System.out.println(deptLoc);
        
        System.out.println("Employee Details:");
        
        // Iterating through the array of dependent objects
        for (Employee emp : employees) {
            System.out.println(emp.getEmpId());
            System.out.println(emp.getEmpName());
        }
    }
}

public class OnetoMany {
    public static void main(String[] args) {
        // Creating Dependent Objects
        Employee emp1 = new Employee(01, "Sachin");
        Employee emp2 = new Employee(02, "Virat");
        Employee emp3 = new Employee(03, "Rohit");

        // Grouping dependent objects into an array
        Employee[] e = new Employee[3];
        e[0] = emp1;
        e[1] = emp2;
        e[2] = emp3;

        // Target Object Creation and Injection
        Department dept = new Department(123, "BCCI", "Dubai", e);

        dept.disp();
    }
}