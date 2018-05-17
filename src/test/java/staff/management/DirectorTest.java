package staff.management;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DirectorTest {

    private Director director;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void before() throws Exception{
        director = new Director ("Helga", "3939393", 60000.00,
            "accounts", 1000000.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("Helga", director.getName());
    }

    @Test
    public void canChangeName() {
        try {
            director.setName("Olga");
        } catch(Exception e) {

        }
        assertEquals("Olga", director.getName());
    }

    @Test
    public void canNotChangeNameToNull() throws Exception {
        thrown.expect(Exception.class);
        director.setName(null);

    }

    @Test
    public void canNotChangeNameToEmptyString() throws Exception {
        thrown.expect(Exception.class);
        director.setName("");
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("3939393", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1);
        assertEquals(60001.00, director.getSalary(), 0.01);
    }

    @Test
    public void preventRaiseSalaryNegative() {
        director.raiseSalary(-10);
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(1200.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("accounts", director.getDeptName());
    }


}