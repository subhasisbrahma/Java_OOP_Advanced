// many-to-many association : This is a relationship between two entities where many objects of one entity are mapped to many pbjects of another entity

class Project { // Dependent Class
    private int pId;
    private String pName;
    private String pMgr;

    public Project(int pId, String pName, String pMgr) {
        this.pId = pId;
        this.pName = pName;
        this.pMgr = pMgr;
    }

    public int getPId() { 
        return pId; 
    }
    public String getPName() { 
        return pName; 
    }
    public String getPMgr() { 
        return pMgr; 
    }
}


class Employee { // Target Class
    private int empId;
    private String empName;
    private Project[] projects; // Has-A variable (Array for multiple dependencies)

    // Using varargs (Project... projects) for flexible Constructor Injection
    public Employee(int empId, String empName, Project... projects) {
        this.empId = empId;
        this.empName = empName;
        this.projects = projects;
    }

    public void disp() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Assigned Projects:");
        for (Project proj : projects) {
            System.out.println(" - ID: " + proj.getPId() + 
                               ", Name: " + proj.getPName() + 
                               ", Manager: " + proj.getPMgr());
        }
    }
}


public class ManytoMany {
    public static void main(String[] args) {
        // Creating multiple Dependent Objects (Projects)
        Project p1 = new Project(01, "Gmail", "Sachin");
        Project p2 = new Project(02, "GMaps", "Virat");
        Project p3 = new Project(03, "GDrive", "Rohit");

        // Creating Target Objects and Injecting Projects
        Employee emp1 = new Employee(11, "Subhasis", p1, p2);
        Employee emp2 = new Employee(22, "Brahma", p2, p3);
        Employee emp3 = new Employee(33, "Ram", p1, p2, p3);

        emp1.disp();
        emp2.disp();
        emp3.disp();
    }
}