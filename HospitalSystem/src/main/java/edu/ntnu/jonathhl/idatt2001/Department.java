package edu.ntnu.jonathhl.idatt2001;

import java.util.HashMap;

public class Department {

    private String departmentName;
    HashMap<String, Patient> patientRegister = new HashMap<String, Patient>();
    HashMap<String, Employee> employeeRegister = new HashMap<String, Employee>();

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

    public void addEmployee(Employee employee) {
        if(!(employeeRegister.containsKey(employee.getSocialSecurityNumber()))) {
            employeeRegister.put(new Employee(employee.getFirstName(), employee.getLastName(),
                    employee.getSocialSecurityNumber()).getSocialSecurityNumber(), employee);
        }
    }

    public HashMap<String, Employee> getEmployeeRegister() {
        return employeeRegister;
    }

    public void addPatient(Patient patient) {
        if(!(patientRegister.containsKey(patient.getSocialSecurityNumber()))) {
            patientRegister.put(new Patient(patient.getFirstName(), patient.getLastName(),
                    patient.getSocialSecurityNumber(), patient.getDiagnosis()).getSocialSecurityNumber(), patient);
        }
    }
}
