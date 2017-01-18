package task4;

import task2.MyException;

public class SomeClass {
    public void f() {
        try {
            g();
        } catch (MyException e) {
            try {
                throw new MyException(e.getMessage());
            } catch (MyException e1) {
                System.err.println(e1.getMessage());
            }
        }
    }

    private void g() throws MyException {
        throw new MyException("Error");
    }
}
