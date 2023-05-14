package Live_Sessions.Exceptions.Bank;

public class CannotBeNegativeException extends Exception{

    public CannotBeNegativeException() {
        super("The input cannot be negative");
    }
}
