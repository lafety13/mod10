package task5;

public class MyException3 extends Exception {
    public MyException3() {
        super();
    }

    public MyException3(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
