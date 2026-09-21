import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main() {
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
}
