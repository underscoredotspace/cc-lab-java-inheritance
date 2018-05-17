package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        this.databaseAdmin = new DatabaseAdmin("Quentin", "C098987656",18000.00);
    }
    @Test
    public void canGetName() {
        assertEquals("Quentin", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("C098987656", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(18000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1);
        assertEquals(18001.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void preventRaiseSalaryNegative() {
        databaseAdmin.raiseSalary(-10);
        assertEquals(18000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(180.00, databaseAdmin.payBonus(), 0.01);
    }

}