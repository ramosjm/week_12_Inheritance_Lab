import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Manager("AA1122",150.55,"DevOps");
    }


    @Test
    public void managerAsEmployee(){
        assertEquals("AA1122",employee.getNiNumber());
    }

    @Test
    public void managerAsEmployeeGetSalary(){
        assertEquals(150.55,employee.getSalary(), 0.001);
    }
}
