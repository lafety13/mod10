package task5;

public class Throw {
    public void exception() throws MyException1, MyException2, MyException3 {
        throw new MyException1("error");
    }
}
