package task5;

public class Main {
    public static void main(String[] args) {
        Throw aThrow = new Throw();
        try {
            aThrow.exception();
        } catch (MyException1 | MyException2 | MyException3 e) {
            e.printStackTrace();
        }
    }
}
