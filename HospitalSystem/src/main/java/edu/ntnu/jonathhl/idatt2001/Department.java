package edu.ntnu.jonathhl.idatt2001;

import java.util.HashMap;

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

     /*
     The class diagram specifies that the code should include hashcode and equals -methods. I won't add this as hashmap
     uses keys to search the list. i.e hashcode and equals are unnecessary.
      */
}
