package task3;

public class Main {
    public static void main(String[] args) {
        try {
            String var = null;
            var.contains("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
