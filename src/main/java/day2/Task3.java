package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        if (a < b) {
            int i = a + 1;
            while (i < b){
                if (i % 5 == 0 && i % 10 != 0){
                    System.out.print(i + " ");
            } i++;
            }
        } else
            System.out.println("Некорректный ввод!");

        }

}
