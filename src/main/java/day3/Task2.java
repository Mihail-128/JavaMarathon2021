package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            if (b == 0) {
                break;
            }
            double result = a / b;
            System.out.println(result);
        }

    }
}
