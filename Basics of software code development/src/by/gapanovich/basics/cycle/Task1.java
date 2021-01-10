package by.gapanovich.basics.cycle;

/*
    Task:
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try{
            System.out.print("Enter positive integer number: ");
            int number = enterNumber(System.in);
            if(isPositive(number)){
                System.out.println("Sum = " + findSum(number));
            } else {
                throw new IOException("Number isn't positive! So bad(");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static boolean isPositive(int number){
        return number > 0;
    }

    public static int findSum(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        return sum;
    }
}
