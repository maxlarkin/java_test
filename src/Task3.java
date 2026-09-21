import java.util.Scanner;

public class Task3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        if (x1 > x2) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println(x2);
            System.out.println(x1);
        }
    }
}
