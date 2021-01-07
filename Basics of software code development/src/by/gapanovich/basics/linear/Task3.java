package by.gapanovich.basics.linear;

/*
    Task:
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     ( ( Sin(x) + Cos(y) ) / ( Cos(x) - Sin(y) ) ) * Tan(xy)
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter x:");
        double x = enterDouble(System.in);
        System.out.println("Enter y:");
        double y = enterDouble(System.in);

        System.out.println("Result = " + findValue(x, y));
    }

    private static double findValue(double x, double y){
        return ( ( Math.sin(x) + Math.cos(y) ) / ( Math.cos(x) - Math.sin((y)) )  * Math.tan(x*y));
    }

    private static double enterDouble(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }
}
