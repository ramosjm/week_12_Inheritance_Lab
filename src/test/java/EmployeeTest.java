import Management.Manager;
import Staff.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void managerAsEmployee(){
        employee = new Manager("AA1122",150.55,"DevOps");
        assertEquals("AA1122",employee.getNiNumber());
    }
}
