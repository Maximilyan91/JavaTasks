package skyproTasks.OOP.Lesson6_Exceptions.exceptions;

public class CantPassDiagnosticException extends Exception{
    String message;

    public CantPassDiagnosticException(String message) {
        super(message);
    }
}
