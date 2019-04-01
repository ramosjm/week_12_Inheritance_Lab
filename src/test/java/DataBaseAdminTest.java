import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("CC345",350.80);
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("CC345",dataBaseAdmin.getNiNumber());
    }

    @Test
    public void  canGetSalary(){
        assertEquals(350.80,dataBaseAdmin.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.80*0.01,dataBaseAdmin.payBonus(),0.001);
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(50);
        assertEquals(400.80,dataBaseAdmin.getSalary(),0.001);
    }

}
