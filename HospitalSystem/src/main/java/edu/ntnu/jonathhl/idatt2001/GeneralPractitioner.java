package edu.ntnu.jonathhl.idatt2001;

/**
 * One of the two doctor types, will be registered as an employee and can set diagnoses on patients.
 * @Author Jonathan Løseth
 * @Version 1.0.0
 */
public class GeneralPractitioner extends Doctor {

    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String fullName) {
        super.setDiagnosis(patient, fullName);
    }
}
