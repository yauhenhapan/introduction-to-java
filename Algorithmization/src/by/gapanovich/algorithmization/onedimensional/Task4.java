package by.gapanovich.algorithmization.onedimensional;

/*
    Task:
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static final int START = -1000;
    public static final int END = 1000;

    public static void main(String[] args) {
        try{
            System.out.print("Enter the size of array: ");
            int size = enterNumber(System.in);
            if (isPositive(size)){
                int[] numbers = new int[size];
                fillArrayFromInterval(START, END, numbers);
                System.out.println("The initial array : " + Arrays.toString(numbers));
                swapMaxAndMinElements(numbers);
                System.out.println("The array after swapping: " + Arrays.toString(numbers));
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

    public static int[] swapMaxAndMinElements(int[] array){
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        if (max == min){
            return array;
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        return array;
    }
}
