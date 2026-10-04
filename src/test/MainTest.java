package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Только ОДИН класс с таким именем!
class MainTest {

    @ParameterizedTest
    @MethodSource("testSelectionSortData")
    void testSelectionSort(int N) {
        int[] arr = new int[N];

        // Заполняем массив в обратном порядке (худший случай для сортировки)
        for (int i = 0; i < N; i++) {
            arr[i] = (int)(Math.random() * N);
        }

        long start = System.nanoTime();

        // Теперь это обращается к вашему классу test.Main, а не к компилятору
//        Main.selectionSort(arr);

        Arrays.sort(arr);

        long diff = System.nanoTime() - start;

        System.out.println("" + diff);


        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1],
                    "Массив не отсортирован! Ошибка на индексе " + i +
                            " (arr[" + i + "]=" + arr[i] + ", arr[" + (i+1) + "]=" + arr[i+1] + ")");
        }
    }

    static Stream<Arguments> testSelectionSortData() {
        return Stream.of(
                Arguments.of(10),
                Arguments.of(10),
                Arguments.of(100),
                Arguments.of(200),
                Arguments.of(400),
                Arguments.of(800),
                Arguments.of(1600),
                Arguments.of(3200),
                Arguments.of(6400),
                Arguments.of(12800),
                Arguments.of(25600),
                Arguments.of(51200),
                Arguments.of(102400)
        );
    }
}