package edu.ntnu.jonathhl.idatt2001;

import java.util.ArrayList;

public class Hospital extends Department{

    private final String hospitalName;
    ArrayList<Department> getDepartments = new ArrayList<Department>();

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
                ", getDepartments=" + getDepartments +
                '}';
    }
}
