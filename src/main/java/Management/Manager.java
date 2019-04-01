package Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String niNumber,double salary, String deptName){
        super(niNumber,salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
