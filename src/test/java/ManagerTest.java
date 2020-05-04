import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("lily", "A001",25000.00,"HR");
    }

    @Test
    public void canHasAName(){
        assertEquals("lily",manager1.getName());
    }

    @Test
    public void belongADepartment(){
        assertEquals("HR",manager1.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager1.raiseSalary(100);
        assertEquals(25100,manager1.getSalary(),0.01);
    }

    @Test
    public void canNotRaiseNegativeSalary(){
        manager1.raiseSalary(-100.0);
        assertEquals(25000.00, manager1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250,manager1.payBonus(),0.01);
    }
}


