package by.gapanovich.basics.branching.task;

/*
    Task:
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.
 */

import by.gapanovich.basics.branching.classes.Point;

import java.io.InputStream;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates (x,y) for three points");
        System.out.println("First point:");
        Point pointA = enterCoordinates(System.in);
        System.out.println("Second point:");
        Point pointB = enterCoordinates(System.in);
        System.out.println("Third point:");
        Point pointC = enterCoordinates(System.in);
        System.out.println("Points lie on one straight line: " + isPointOnLine(pointA, pointB, pointC));
    }

    private static Point enterCoordinates(InputStream input){
        Scanner scan = new Scanner(input);
        System.out.print("x = ");
        int x = scan.nextInt();
        System.out.print("y = ");
        int y = scan.nextInt();
        return new Point(x, y);
    }

    private static boolean isPointOnLine(Point firstPoint, Point secondPoint, Point thirdPoint){
        return (thirdPoint.getX() * (secondPoint.getY() - firstPoint.getY()) -
                thirdPoint.getY() * (secondPoint.getX() - firstPoint.getX()) ==
                firstPoint.getX() * secondPoint.getY() - secondPoint.getX() * firstPoint.getY());
    }
}
