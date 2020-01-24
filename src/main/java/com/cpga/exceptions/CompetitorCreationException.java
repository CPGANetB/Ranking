package com.cpga.exceptions;


/**
 * Represents a error in the creation of a competitor.
 */
public class CompetitorCreationException extends Exception {

    /**
     * Create a error with a specific message.
     *
     * @param message
     */
    public CompetitorCreationException(String message) {
        super(message);
    }
}
