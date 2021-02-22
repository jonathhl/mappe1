package edu.ntnu.jonathhl.idatt2001;

/**
 * Class dedicated to giving information out to several other subclasses.
 * @Author Jonathan Løseth
 * @Version 1.0.0
 */
public class Employee extends Person {

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
