package staff.management;

public class Director extends Manager {

    private double budget;

    public Director (String name, String NiNumber, double salary, String deptName, double budget) throws Exception {
        super(name, NiNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    @Override
    public double payBonus() {
        return this.getSalary() * 0.02;
    }
}
