package by.gapanovich.algorithmization.onedimensional;

/*
    Task:
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task1 {
    public static final int K = 2;

    public static void main(String[] args) {
       try {
           System.out.print("Enter this size of array: ");
           int size = enterNumber(System.in);
           if(isPositive(size)){
               int[] array = new int[size];
               fillArray(array);
               int sum = findSum(array, K);
               System.out.println("Sum of numbers divisible by " + K + " = " + sum);
           } else{
               throw new IOException("The size is not correct! So bad(((");
           }
       } catch (IOException exception){
           exception.printStackTrace();
       }

    }

    public static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static boolean isPositive(int number){
        return number > 0;
    }

    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }

    public static int findSum(int[] array, int k){
        int sum = 0;
        for(int elem: array){
            if (elem % k == 0){
                sum += elem;
            }
        }
        return sum;
    }
}
