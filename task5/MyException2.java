package task5;

public class MyException2 extends Exception {
    public MyException2() {
        super();
    }

    public MyException2(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
