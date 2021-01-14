package by.gapanovich.algorithmization.onedimensional;

/*
    Task:
    Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
*/

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
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
                findNumbersGreaterThanTheirIndex(numbers);
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

    public static void findNumbersGreaterThanTheirIndex(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > i){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
