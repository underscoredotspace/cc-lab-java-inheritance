package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) throws Exception {
        this.setName(name);
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raiseAmount) {
        if (raiseAmount < 0) {
            return;
        }

        this.salary += raiseAmount;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String newName) throws Exception {
        if (newName == null || newName.length() == 0) {
            throw new Exception("Name can't be null");
        }

        this.name = newName;
    }
}
