package calculator;

public class NoSuchArithmeticOperationException extends Throwable {
    public NoSuchArithmeticOperationException() {
    }

    public NoSuchArithmeticOperationException(String message) {
        super(message);
    }

    public NoSuchArithmeticOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchArithmeticOperationException(Throwable cause) {
        super(cause);
    }

    public NoSuchArithmeticOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
