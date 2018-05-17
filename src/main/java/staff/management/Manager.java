package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    Manager(String name, String niNumber, double salary, String deptName) throws Exception {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
