import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave","cb345",250.20);
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("cb345",developer.getNiNumber());
    }

    @Test
    public void  canGetSalary(){
        assertEquals(250.20,developer.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.20*0.01,developer.payBonus(),0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50);
        assertEquals(300.20,developer.getSalary(),0.001);
    }


}
