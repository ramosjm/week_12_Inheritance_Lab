import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("AA111",300.20,"Sales",5000.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(5000.00,director.getBudget(),0.001);
    }
}
