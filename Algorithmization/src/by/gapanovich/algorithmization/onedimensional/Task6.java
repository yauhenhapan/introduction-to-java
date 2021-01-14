package by.gapanovich.algorithmization.onedimensional;

/*
    Task:
    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static final int START = -100;
    public static final int END = 100;

    public static void main(String[] args) {
        try{
            System.out.print("Enter the size of array: ");
            int size = enterNumber(System.in);
            if (isPositive(size)){
                int[] numbers = new int[size];
                fillArrayFromInterval(START, END, numbers);
                System.out.println("The initial array : " + Arrays.toString(numbers));
                System.out.println("The sum = " + findSum(numbers));
            } else {
                throw new IOException("The size is not correct! Sad=(");
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

    public static int[] fillArrayFromInterval(int start, int end, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* (end - start)) + start;
        }
        return array;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if ((number % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static int findSum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if(isPrime(i+1)){
                sum += numbers[i];
            }
        }
        return sum;
    }
}
