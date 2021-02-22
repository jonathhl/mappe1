package edu.ntnu.jonathhl.idatt2001;

/**
 * Exception class
 * @author Jonathan Løseth
 * @version 1.0.0
 */
public class RemoveException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public RemoveException() {
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public RemoveException(String message) {
        super(message);
    }
}
