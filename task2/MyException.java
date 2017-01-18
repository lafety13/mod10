package task2;

public class MyException extends Exception {
    //private String msg;

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
