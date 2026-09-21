import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 5;
        System.out.print(y);
    }
}
