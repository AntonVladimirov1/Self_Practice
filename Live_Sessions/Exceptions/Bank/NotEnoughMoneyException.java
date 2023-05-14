package Live_Sessions.Exceptions.Bank;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
