package by.gapanovich.basics.cycle;

/*
    Task:
    Найти сумму квадратов первых ста чисел.
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        System.out.print("number = ");
        int number = enterNumber(System.in);

        System.out.println("Sum = " + findSumSquares(number));
    }

    public static int findSumSquares(int number){
        if (number == 1){
            return 1;
        }
        return number * number + findSumSquares(number - 1);
    }

    public static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }
}
