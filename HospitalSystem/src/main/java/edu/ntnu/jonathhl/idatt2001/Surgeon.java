package edu.ntnu.jonathhl.idatt2001;

public class Surgeon extends Doctor {

    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String fullName) {
        super.setDiagnosis(patient, fullName);
    }
}