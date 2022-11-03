package exception;

public class ArgumentNotFoundException extends RuntimeException {
    public ArgumentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
