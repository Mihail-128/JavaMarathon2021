package day2;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of floor --> ");
        int floor = in.nextInt();

        if (floor >= 1 && floor <= 4){
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else
            System.out.println("Ошибка ввода!");

    }
}
