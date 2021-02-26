package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int counter = 0, counter1 = 0, counter2 = 0, counter3 = 0;
        int total = 0;
        System.out.println("Длина массива: " + n);
        System.out.print("Элементы массива: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(11);
            total += numbers[i];
            if (numbers[i] > 8) {
                counter ++;
            }
            if (numbers[i] == 1) {
                counter1 ++;
            }
            if (numbers[i] % 2 == 0) {
                counter2 ++;
            } else {
                counter3 ++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Количество чисел больше 8: " + counter);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counter2);
        System.out.println("Количество нечетных чисел: " + counter3);
        System.out.println("Сумма всех элементов массива: " + total);
    }
}
