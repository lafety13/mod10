package task2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Error");
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
}
