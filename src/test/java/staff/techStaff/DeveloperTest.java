package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.*;

public class DeveloperTest {
    private Developer developer;


    @Before
    public void before(){
        this.developer = new Developer("Annie", "CM1234567",24000.00);
    }
    @Test
    public void canGetName() {
        assertEquals("Annie", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("CM1234567", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1);
        assertEquals(24001.00, developer.getSalary(), 0.01);
    }

    @Test
    public void preventRaiseSalaryNegative() {
        developer.raiseSalary(-10);
        assertEquals(24000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(240.00, developer.payBonus(), 0.01);
    }
}