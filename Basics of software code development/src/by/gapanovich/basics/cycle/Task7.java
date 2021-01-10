package by.gapanovich.basics.cycle;

/*
    Task:
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        try{
            System.out.print("Enter number = ");
            int number = enterNumber(System.in);
            System.out.println("Enter the interval [m;n]");
            System.out.print("Enter m = ");
            int m = enterNumber(System.in);
            System.out.print("Enter n = ");
            int n = enterNumber(System.in);
            if(areIntegers(number, m, n)){
                System.out.println(findDivisorsOnInterval(number, m, n));
            } else {
                throw new IOException("Bad input ! Values are not positive integers(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> findDivisorsOnInterval(int number, int m, int n){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = Math.min(m, n); i <= Math.max(m,n); i++){
            if (number % i == 0 && i != 1 && i != number){
                res.add(i);
            }
        }
        return res;
    }

    public static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static boolean areIntegers(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber > 0 && secondNumber > 0 && thirdNumber > 0;
    }

}
