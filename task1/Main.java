package task1;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
