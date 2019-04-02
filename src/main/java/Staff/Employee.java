package Staff;

public abstract class Employee {

    private String niNumber;
    private double salary;
    private String name;

    public Employee(String name, String niNumber, double salary){
        this.niNumber = niNumber;
        this.salary = salary;
        this.name = name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void raiseSalary(double bonus){
        this.salary +=bonus;

    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public String setName(String name){
        if (name != null){
            this.name = name;
            return "Name added";
        }else{
            return "Name cannot be null";
        }
    }


}
