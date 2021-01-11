package by.gapanovich.basics.cycle;

/*
    Task:
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("The first number = ");
        int firstNumber = enterNumber(System.in);
        System.out.print("The second number = ");
        int secondNumber = enterNumber(System.in);
        System.out.println("The same digits in two numbers:");
        printSameDigitsInTwoNumbers(firstNumber, secondNumber);
    }

    public static void printSameDigitsInTwoNumbers(int firstNumber, int secondNumber){
        boolean[] isExistDigit = new boolean[10];
        boolean[] isExistSameDigitInAnotherNumber = new boolean[10];
        Arrays.fill(isExistDigit, false);
        Arrays.fill(isExistSameDigitInAnotherNumber, false);
        if (firstNumber < 0){
            firstNumber *= -1;
        }
        while(firstNumber > 0){
            isExistDigit[firstNumber % 10] = true;
            firstNumber /= 10;
        }

        if (secondNumber < 0){
            secondNumber *= -1;
        }
        while(secondNumber > 0){
            if(isExistDigit[secondNumber % 10]){
                isExistSameDigitInAnotherNumber[secondNumber % 10] = true;
            }
            secondNumber /= 10;
        }
        for (int i = 0; i < isExistSameDigitInAnotherNumber.length; i++){
            if (isExistSameDigitInAnotherNumber[i]){
                System.out.print(i + " ");
            }
        }
    }


    public static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }
}
