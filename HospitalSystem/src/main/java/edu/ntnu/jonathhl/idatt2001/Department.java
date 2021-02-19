package edu.ntnu.jonathhl.idatt2001;

import java.util.HashMap;

public class Department {

    private String departmentName;
    HashMap<String, Patient> patientRegister = new HashMap<String, Patient>();
    HashMap<String, Employee> employeeRegister = new HashMap<String, Employee>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee(Employee employee) {
        if(!(employeeRegister.containsKey(employee.getSocialSecurityNumber()))) {
            employeeRegister.put(new Employee());
        }
    }
}
