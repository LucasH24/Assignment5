package wctc.edu;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException() {}

    public InvalidBirthdayException(String message) {
        super("The given birthday is invalid");}
}

