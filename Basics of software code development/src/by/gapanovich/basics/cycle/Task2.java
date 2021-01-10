package by.gapanovich.basics.cycle;

/*
    Task:
    Вычислить значения функции на отрезке [а,b] c шагом h:
    F(x) = x, if x > 2 AND = -x, x <=2
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter value of segment [a;b]");
        System.out.print("a = ");
        double a = enterNumber(System.in);
        System.out.print("b = ");
        double b = enterNumber(System.in);
        System.out.println("Enter the step");
        double h = enterNumber(System.in);

        double[] values = findValuesFunc(a, b, h);
        System.out.println("Values of func:");
        printArray(values);
    }

    public static double[] findValuesFunc(double a, double b, double h){
        int count = (int)(Math.abs(a - b) / h) + 1;
        double[] values = new double[count];
        double step = a;
        for (int i = 0; i < count; i++){
            if (step > 2){
                values[i] = step;
            } else {
                values[i] = -step;
            }
            step += h;
        }
        return values;
    }

    public static double enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }

    public static void printArray(double[] array){
        for (double value : array) {
            System.out.println("Value = " + value);
        }
    }
}
