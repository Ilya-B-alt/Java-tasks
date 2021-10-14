package javafundamentals.optionaltask1;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers, please");
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i].length() < array[i - 1].length()) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
