package by.gapanovich.basics.linear;

/*
    Task:
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    ( (b + sqrt(b^2 + 4*a*c)) / 2*a ) - (a^3)*c + 1/(b^2)
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter three double numbers\nFirst number:");
        double firstNumber = enterDouble(System.in);
        System.out.print("Second number:");
        double secondNumber = enterDouble(System.in);
        System.out.print("Third number:");
        double thirdNumber = enterDouble(System.in);

        System.out.println("Result:" + findValue(firstNumber, secondNumber, thirdNumber));
    }

    public static double enterDouble(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }

    public static double findValue(double a, double b, double c) throws IOException {
        if(isCorrectValues(a, b, c)){
            return  ((b + Math.sqrt(Math.pow(b,2) + 4*a*c)) / 2*a ) - Math.pow(a,3) + 1/Math.pow(b,2);
        } else {
            throw new IOException("Input values are not correct!");
        }
    }

    public static boolean isCorrectValues(double a, double b, double c){
        return a != 0 && b != 0 && (Math.pow(b,2) + 4*a*c) >= 0;
    }
}
