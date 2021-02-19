package edu.ntnu.jonathhl.idatt2001;

public class Patient extends Person {

    private String diagnosis;

    public Patient(String firstName, String lastName, String socialSecurityNumber, String diagnosis) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
