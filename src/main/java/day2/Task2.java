package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        if (a < b){
            for (int i = a+1; i < b; i++){
                if (i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
            }
        } else
            System.out.println("Некорректный ввод!");
    }
}
