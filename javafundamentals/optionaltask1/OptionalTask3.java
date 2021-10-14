package javafundamentals.optionaltask1;

import java.util.Scanner;

public class OptionalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers, please");
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }

        int totalNumberOfSymbols = 0;
        for (String s : array) {
            totalNumberOfSymbols += s.length();
        }

        int averageNumberOfSymbols = totalNumberOfSymbols / array.length;

        System.out.println("Numbers with length above average:");
        for (String s : array) {
            if (s.length() > averageNumberOfSymbols ) {
                System.out.println("Number: " + s + ", length: " + s.length());
            }
        }
    }
}

