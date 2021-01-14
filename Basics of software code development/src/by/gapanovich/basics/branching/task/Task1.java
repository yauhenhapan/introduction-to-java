package by.gapanovich.basics.branching.task;

/*
    Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the first angle of the triangle:");
            int firstAngle = enterAngle(System.in);
            System.out.print("Enter the second angle of the triangle:");
            int secondAngle = enterAngle(System.in);
            if (isExistTriangle(firstAngle, secondAngle)){
                System.out.println("Triangle is exist! Very cool!");
                if (findRemainingAngle(firstAngle, secondAngle) == 90){
                    System.out.println("Wooow! This triangle is rectangular");
                } else {
                    System.out.println("Ohhh... This triangle isn't rectangular");
                }
            } else {
                throw new IOException("Such triangle is not exist! Very bad(");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int enterAngle(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static boolean isExistTriangle(int firstAngle, int secondAngle){
        return firstAngle > 0 && secondAngle > 0 && (firstAngle + secondAngle) < 180;
    }

    public static int findRemainingAngle(int firstAngle, int secondAngle){
        return 180 - firstAngle - secondAngle;
    }
}
