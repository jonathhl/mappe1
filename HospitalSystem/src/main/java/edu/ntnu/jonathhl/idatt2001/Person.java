package edu.ntnu.jonathhl.idatt2001;

/**
 * Abstract class containing attributes on personal info.
 * @author Jonathan Løseth
 * @version 1.0.0
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Constructor that takes all info from the attributes.
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Method to combine the first and last names into one complete string.
     * @param firstName
     * @param lastName
     * @param fullName
     * @return
     */
    public String getFullName(String firstName, String lastName, String fullName) {
        return fullName += firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
