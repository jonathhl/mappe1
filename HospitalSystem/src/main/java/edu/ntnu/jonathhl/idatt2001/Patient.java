package edu.ntnu.jonathhl.idatt2001;

/**
 * Abstract class containing info on a patients diagnosis, the diagnosis can also be set or changed here.
 * @author Jonathan Løseth
 * @version 1.0.0
 */
public class Patient extends Person {

    private String diagnosis;

    protected Patient(String firstName, String lastName, String socialSecurityNumber, String diagnosis) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
