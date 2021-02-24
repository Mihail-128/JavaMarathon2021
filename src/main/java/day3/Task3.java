package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            double result = a / b;
            System.out.println(result);

        }
    }
}
