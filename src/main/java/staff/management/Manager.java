package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }
}