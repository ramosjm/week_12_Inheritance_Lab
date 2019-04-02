import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MangerTest {


    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John","ab12345",100.40,"HR");

    }
    @Test
    public void canGetNiNumber(){
        assertEquals("ab12345",manager.getNiNumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(100.40,manager.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR",manager.getDeptName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(100.40*0.01,manager.payBonus(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10.00);
        assertEquals(110.40,manager.getSalary(),0.001);
    }

    @Test
    public void canSetName(){
        manager.setName("Craig");
        assertEquals("Craig",manager.getName());
    }

}
