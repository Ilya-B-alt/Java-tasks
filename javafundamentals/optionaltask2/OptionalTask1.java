package javafundamentals.optionaltask2;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = 0;
        System.out.println("Enter any number");
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        } else {
            System.out.println("Not a number");
        }
        int[][] matrix = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (random.nextInt(30) - 15);
            }
        }
        //Упорядочил строки в порядке возрастания значений первого столбца
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][0] < matrix[i - 1][0]) {
                    int[] temp = matrix[i];
                    matrix[i] = matrix[i - 1];
                    matrix[i - 1] = temp;
                    isSorted = false;

                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
