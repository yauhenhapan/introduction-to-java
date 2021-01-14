package by.gapanovich.algorithmization.onedimensional;

/*
    Task3:
    Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static final int START = -1000;
    public static final int END = 1000;

    public static void main(String[] args) {
        try{
            System.out.print("Enter the size of array: ");
            int size = enterNumber(System.in);
            if (isPositive(size)){
                int[] numbers = new int[size];
                fillArrayFromInterval(START, END, numbers);
                countPositiveAndNegativeAndZeroNumbers(numbers);
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

    public static void countPositiveAndNegativeAndZeroNumbers(int[] numbers){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int number: numbers){
            if(number > 0){
                countPositive++;
            } else if (number < 0){
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("The count of positive numbers = " + countPositive);
        System.out.println("The count of negative numbers = " + countNegative);
        System.out.println("The count of zero numbers = " + countZero);
    }
}
