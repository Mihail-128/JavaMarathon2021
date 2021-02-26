package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number_null = 0, total = 0;
        int[] numbers = new int[100];
        int largest = 0, smallest = 10000;
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10000);
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (numbers[i] % 10 == 0) {
                total += numbers[i];
                number_null++;
            }
        }
        System.out.println("Наибольшее число: " + largest);
        System.out.println("Наименьшее число: " + smallest);
        System.out.println("Количество чисел кончающихся на ноль: " + number_null);
        System.out.println("Сумма чисел оканчивающихся на ноль: " + total);

    }
}
