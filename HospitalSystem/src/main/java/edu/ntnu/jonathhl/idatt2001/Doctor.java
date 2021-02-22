package edu.ntnu.jonathhl.idatt2001;

/**
 * Abstract class used by the classes "Surgeon.java" and "GeneralPractitioner.java"
 * @author Jonathan Løseth
 * @Version 1.0.0
 */
public abstract class Doctor extends Employee {

    /**
     * Constructor for the class, it gets info from the class "Employee.java"
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public void setDiagnosis(Patient patient, String fullName) {

    }
}
