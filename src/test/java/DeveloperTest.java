import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("sam","A002",30000.00);
    }

    @Test
    public void canHasName(){
        assertEquals("sam",developer1.getName());
    }

    @Test
    public void canHasNINumber(){
        assertEquals("A002",developer1.getNI_number());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000,developer1.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(200.0);
        assertEquals(30200.00,developer1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, developer1.payBonus(),0.01);
    }

    @Test
    public void canNotRaiseNegativeSalary(){
        developer1.raiseSalary(-100.0);
        assertEquals(30000.00, developer1.getSalary(),0.01);
    }

    @Test
    public void canNotSetNameToSpace(){
        developer1.setName("  ");
        assertEquals("sam",developer1.getName());
    }
}
