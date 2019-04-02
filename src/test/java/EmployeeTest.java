import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Manager("Sandra","AA1122",150.55,"DevOps");
    }


    @Test
    public void managerAsEmployee(){
        assertEquals("AA1122",employee.getNiNumber());
    }

    @Test
    public void managerAsEmployeeGetSalary(){
        assertEquals(150.55,employee.getSalary(), 0.001);
    }

    @Test
    public void managerAsEmployeeCanRaiseSalary(){
        employee.raiseSalary(30.00);
        assertEquals(180.55,employee.getSalary(),0.001);
    }

    @Test
    public void managerAsEmployeeCanPayBonus(){
        assertEquals(150.55*0.01,employee.payBonus(),0.001);
    }
}
