package javafundamentals.optionaltask1;

import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers, please");
        //Использовал массив String, а не int, так как нужно найти максимальную длину (количество символов),
        // а не значение
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i].length() < array[i -1].length()) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }

        }
        String shortestNumber = array[0];
        String longestNumber = array[9];
        System.out.println("Shortest number is: " + shortestNumber + ", Its length is: " + shortestNumber.length());
        System.out.println("Longest number is: " + longestNumber + ", Its length is: " + longestNumber.length());
    }
}