package Staff;

public abstract class Employee {

    private String niNumber;
    private double salary;

    public Employee(String niNumber, double salary){
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double bonus){
        this.salary +=bonus;

    }

    public double payBonus(){
        return this.salary * 0.01;
    }




}
