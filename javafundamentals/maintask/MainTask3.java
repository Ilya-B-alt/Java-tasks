package javafundamentals.maintask;


import java.util.Random;
import java.util.Scanner;

public class MainTask3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number, please");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int [] array = new int[number];
            Random random = new Random();
            for (int element : array) {
                array[element] = random.nextInt(number-1);
                System.out.println(array[element]);
                //System.out.print(array[element] + " ");
            }
        } else { System.out.println("NAN"); }

    }
}
