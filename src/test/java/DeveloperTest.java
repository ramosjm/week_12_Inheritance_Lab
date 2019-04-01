import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("cb345",250.20);
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("cb345",developer.getNiNumber());
    }


}
