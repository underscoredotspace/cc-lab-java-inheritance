package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void before(){

        this.manager = new Manager ("Jimmy", "JW3344567",
            30000.00, "accounts");
    }
    @Test
    public void canGetName() {
        assertEquals("Jimmy", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JW3344567", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1);
        assertEquals(30001.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }

}