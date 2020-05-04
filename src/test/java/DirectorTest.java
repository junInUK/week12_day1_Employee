import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director1;

    @Before
    public void before(){
        director1 = new Director("jun","A005",50000,"management",10000);
    }

    @Test
    public void canBelongADepartment(){
        assertEquals("management",director1.getDeptName());
    }

    @Test
    public void canHasBudget(){
        assertEquals(10000,director1.getBudget(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(500.00);
        assertEquals(50500,director1.getSalary(),0.01);
    }

    @Test
    public void canNotRaiseNegativeSalary(){
        director1.raiseSalary(-100.0);
        assertEquals(50000.00, director1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000,director1.payBonus(),0.01);
    }
}
