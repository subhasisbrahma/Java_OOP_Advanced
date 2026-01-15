// one-to-one association : This is a kind of relationship between two entities where one object of one entity is mapped to exactly one object of another entity.

class Account { // Dependent class
    private int accNo;
    private String accType;
    private String accName;

    // Constructor Injection point
    public Account(int accNo, String accType, String accName) {
        this.accNo = accNo;
        this.accType = accType;
        this.accName = accName;
    }

    // Getters
    public int getAccNo() { 
        return accNo; 
    }
    public String getAccType() { 
        return accType; 
    }
    public String getAccName() { 
        return accName; 
    }
}

class Employee { // Target class
    private int empId;
    private String empName;
    private String empAddr;
    
    // Has-A variable (Reference to the dependent object)
    private Account acc; 

    // Constructor Injection of the dependent Account object
    public Employee(int empId, String empName, String empAddr, Account acc) {
        this.empId = empId;
        this.empName = empName;
        this.empAddr = empAddr;
        this.acc = acc;
    }

    public void disp() {
        System.out.println("Employee details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Addr: " + empAddr);
        System.out.println("Account details:");
        System.out.println("Account No: " + acc.getAccNo());
        System.out.println("Account Type: " + acc.getAccType());
        System.out.println("Account Name: " + acc.getAccName());
    }
}


public class OnetoOne {
    public static void main(String[] args) {
        // Dependent Object Creation
        Account acc = new Account(1234, "Savings", "Subhasis");

        // Target Object Creation
        Employee emp = new Employee(99, "Subhasis", "Bengaluru", acc);

        emp.disp();
    }
}