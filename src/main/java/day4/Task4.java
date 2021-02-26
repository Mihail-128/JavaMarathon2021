package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int index = -1;
        int sum_max = 0, total;
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10000);
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < 88; i++) {
            total = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum_max < total) {
                sum_max = total;
                index = i;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма: " + sum_max);
        System.out.println("Индекс первого элемента в тройке: " + index);
    }
}
