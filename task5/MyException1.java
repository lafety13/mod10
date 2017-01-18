package task5;

public class MyException1 extends Exception {
    public MyException1() {
        super();
    }

    public MyException1(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
