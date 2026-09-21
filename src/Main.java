import java.util.Scanner;
import java.util.Arrays;

//public class Main{
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//    }
//}
public class Main{

    public static void task4() {
        System.out.println("Данная функция производит сортировку пузырьком. Введите массив чисел, разделенных пробелом");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splInp = input.split(" ");

        int[] arr;

        try {
            arr = Arrays.stream(splInp)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch(Throwable _) {
            System.out.println("Был введен невалидный массив.");
            return;
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 4, 5, 8]
    }

    public static void task3() {
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

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 3 * x ^ 6 - 6 * x ^ 2 - 5;
        System.out.print(y);
    }

    public static void task1() {
        Character str = 'B';
        String y = "Кошка";
        String number = "Кошка";
        Character g = 'S';
        byte l = '8';
        short value = 'g';
        String s = "Собака";
        Double x = 1278.11427079066035725;
        String f = "Море";
        Integer b = 303;
        char some_name = 'i';
        Character h = 'o';
        String z = "велосипед";
        int p = 7;
        String a = "снежинка";
    }
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }
}

