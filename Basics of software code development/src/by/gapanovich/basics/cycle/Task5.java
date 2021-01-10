package by.gapanovich.basics.cycle;

/*
    Task:
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид: A(n) = 1 / 2^n + 1 / 3^n
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter value 'e':");
        double e = enterNumber(System.in);
        System.out.println("Sum = " + findSum(e));
    }

    public static double findSum(double e){
        if(e <= 0){
            return 1.5;
        }
        double sum = 0;
        double temp = 0;
        double degree = 1;
        do {
            sum += temp;
            temp = ( 1 / Math.pow(2, degree) ) + ( 1 / Math.pow(3, degree) );
            degree++;
        } while(temp >= e);

        return sum;
    }

    public static double enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }
}
