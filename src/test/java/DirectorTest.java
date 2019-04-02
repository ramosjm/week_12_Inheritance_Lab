import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Karla","AA111",300.20,"Sales",5000.00);
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("AA111",director.getNiNumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(300.20,director.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales",director.getDeptName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.20*0.02,director.payBonus(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.00);
        assertEquals(310.20,director.getSalary(),0.001);
    }

    @Test
    public void canGetBudget(){
        assertEquals(5000.00,director.getBudget(),0.001);
    }
}
