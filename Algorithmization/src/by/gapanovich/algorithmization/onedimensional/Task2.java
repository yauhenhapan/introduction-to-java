package by.gapanovich.algorithmization.onedimensional;

/*
    Task:
    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static final int Z = 5;

    public static void main(String[] args) {
        try{
            System.out.print("Enter the size of array: ");
            int size = enterNumber(System.in);
            if (isPositive(size)){
                int[] sequenceNumbers = new int[size];
                fillArray(sequenceNumbers);
                replaceNumbers(sequenceNumbers, Z);
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

    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }

    public static void replaceNumbers(int[] array, int replacement){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > replacement){
                array[i] = replacement;
                count++;
            }
        }
        if (count > 0){
            System.out.println("New array: " + Arrays.toString(array));
            System.out.println("The count of replacements = " + count);
        } else {
            System.out.println("There are no replacements");
        }
    }
}
