package com.company;

public class MainTask4 {
    public static void main(String[] args) {

        int [] array = new int[args.length];
        for (int i = 0; i < array.length; i++ ) {
            array [i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
          for (int i = 0; i < array.length; i++) {
              sum += array[i];
          }
        System.out.println(sum);
        }
}





