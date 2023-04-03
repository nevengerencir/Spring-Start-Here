package sqch10ex1.main.model;

public class ErrorDetails {
    private  String message;

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
