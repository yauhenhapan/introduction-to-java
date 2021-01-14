package by.gapanovich.basics.linear;

/*
    Task:
    Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Enter three double numbers\nFirst number:");
        double firstNumber = enterDouble(System.in);
        System.out.print("Second number:");
        double secondNumber = enterDouble(System.in);
        System.out.print("Third number:");
        double thirdNumber = enterDouble(System.in);

        System.out.println("The value of function = " + findValue(firstNumber, secondNumber, thirdNumber));
    }

    public static double enterDouble(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }

    public static double findValue(double a, double b, double c){
        return ((a-3) * b / 2) + c;
    }
}
