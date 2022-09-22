package wctc.edu;

public class UnknownGenderException extends Exception {
    public UnknownGenderException() {}

    public UnknownGenderException(String message) {
        super("The gender code is not known");}
}

