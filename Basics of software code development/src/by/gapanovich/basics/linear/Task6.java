package by.gapanovich.basics.linear;

/*
    Task:
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае
 */


import java.io.InputStream;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates (x,y) of a point:");
        System.out.print("x=");
        int x = enterCoordinate(System.in);
        System.out.print("y=");
        int y = enterCoordinate(System.in);

        System.out.println("Point " + "(" + x + ";" + y + ")" + " belongs to area:" + isBelong(x,y));
    }

    public static int enterCoordinate(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static boolean isBelong(int x, int y){
        return (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }
}
