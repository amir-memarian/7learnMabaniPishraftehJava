package kata.stack;

public class StackOverflowException extends RuntimeException { //unchecked Exception
    public StackOverflowException(String message) {
        super(message);
    }
}
