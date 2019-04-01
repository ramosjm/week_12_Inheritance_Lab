package Management;

public class Director extends Manager {
    private double budget;

    public Director(String niNumber, double salary, String deptName, double budget){
        super(niNumber,salary,deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return super.payBonus() * 2;
    }
}
