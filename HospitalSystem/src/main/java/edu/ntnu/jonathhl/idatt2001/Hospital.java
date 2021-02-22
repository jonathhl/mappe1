package edu.ntnu.jonathhl.idatt2001;

import java.util.ArrayList;

/**
 * Class used to keep info on the different departments. The class does not have access to personal information on
 * employees and patients.
 * @Author Jonathan Løseth
 * @Version 1.0.0
 */
public class Hospital{

    private final String hospitalName;
    ArrayList<Department> Departments = new ArrayList<Department>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addDepartment(Department departmentName) {

    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", getDepartments=" + Departments +
                '}';
    }
}
