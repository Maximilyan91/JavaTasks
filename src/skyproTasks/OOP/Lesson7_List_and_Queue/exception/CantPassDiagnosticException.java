package skyproTasks.OOP.Lesson7_List_and_Queue.exception;

public class CantPassDiagnosticException extends Exception{
    String message;

    public CantPassDiagnosticException(String message) {
        super(message);
    }
}
