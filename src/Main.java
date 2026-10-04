package test;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
//        selectionSort();
        System.out.println("hello, World");
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }

    }
}

