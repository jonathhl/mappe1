import edu.ntnu.jonathhl.idatt2001.Department;
import edu.ntnu.jonathhl.idatt2001.Employee;
import edu.ntnu.jonathhl.idatt2001.Patient;
import edu.ntnu.jonathhl.idatt2001.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTests {

    Department dm = new Department("Department");
    public void testDummies() {
        dm.addPatient(new Patient("Arild", "Pedersen", "2", "Dead"));
        dm.addEmployee(new Employee("Roald", "Dahl", "1"));
    }

    @Test
    @DisplayName("Checks if a new employee can be added")
    public void newEmployeeAdd(Person person) {
        assertTrue(dm.getEmployeeRegister().size() == 1);
    }

    @Test
    @DisplayName("Checks if it gets thrown an exception if person could nnot be found")
    public void throwsExceptionWhenRemoveFromSystemNotWork(Person person) {
        assertThrows();
    }

}
