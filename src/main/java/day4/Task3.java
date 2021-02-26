package day4;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0, sum_max = 0, index = -7;
        int[][] matrix = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = random.nextInt(50);
                total += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            if (total >= sum_max) {
                sum_max = total;
                index = i;
            }
            total = 0;
            System.out.println();
        }
        System.out.println("Максимальная сумма: " + sum_max);
        System.out.println("Индекс строки с максимальной суммой: " + index);

    }
}
