import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(Math.pow(a, 28));
        }
        catch (Exception e) {
            System.out.println("нет");
        }
        finally {
            ;
        }
    }
}