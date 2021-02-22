package edu.ntnu.jonathhl.idatt2001;

import java.util.HashMap;
import java.util.Objects;

/**
 * Class dedicated to hold info and registries on registered patients and/or employees in their respected departments.
 * @author Jonathan Løseth
 * @version 1.0.0
 */
public class Department {

    private String departmentName;
    HashMap<String, Patient> patientRegister = new HashMap<String, Patient>();
    HashMap<String, Employee> employeeRegister = new HashMap<String, Employee>();

    /**
     * Constructor-method for the class.
     * @param departmentName Takes the name of the department
     * @param patientRegister Takes the registry with patient info.
     * @param employeeRegister Takes the registry with employee info.
     */
    public Department(String departmentName, HashMap<String, Patient> patientRegister, HashMap<String, Employee> employeeRegister) {
        this.departmentName = departmentName;
        this.patientRegister = patientRegister;
        this.employeeRegister = employeeRegister;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Method to add a new employee.
     * @param employee catches info about the new employee-to-be and checks in the employee registry if the person
     *                 is already registered. If not, then they get added.
     */
    public void addEmployee(Employee employee) {
        if(!(employeeRegister.containsKey(employee.getSocialSecurityNumber()))) {
            employeeRegister.put(new Employee(employee.getFirstName(), employee.getLastName(),
                    employee.getSocialSecurityNumber()).getSocialSecurityNumber(), employee);
        }
    }

    public String getEmployeeRegister(String register) {
        register += employeeRegister.toString();
        return register;
    }

    /**
     * Method that does the same as the "addEmployee" -method above, but takes the patient info instead.
     * @param patient
     */
    public void addPatient(Patient patient) {
        if(!(patientRegister.containsKey(patient.getSocialSecurityNumber()))) {
            patientRegister.put(new Patient(patient.getFirstName(), patient.getLastName(),
                    patient.getSocialSecurityNumber(), patient.getDiagnosis()).getSocialSecurityNumber(), patient);
        }
    }

    public String getPatientRegister(String register) {
        register += patientRegister.toString();
        return register;
    }

    /**
     * Method that makes the program able to remove either a patient or an employee. It contains an if-statement that
     * checks patientRegister first for the specified key (in this case Social Security Number), and goes through
     * the employee list instead if there are no patients found. The method then proceeds to remove that person from the
     * system.
     * @param person
     */
    public void remove(Person person) throws RemoveException {
        if(patientRegister.containsKey(person.getSocialSecurityNumber())) {
            patientRegister.remove(person.getSocialSecurityNumber());
        } else if(employeeRegister.containsKey(person.getSocialSecurityNumber())) {
            employeeRegister.remove(person.getSocialSecurityNumber());
        } else {
            throw new RemoveException("Could not find the specified person.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName) && patientRegister.equals(that.patientRegister)
                && employeeRegister.equals(that.employeeRegister);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, patientRegister, employeeRegister);
    }
}
