package by.gapanovich.basics.branching;

/*
    Task:
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.
 */

import java.io.InputStream;
import java.util.Objects;
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

class Point {
    private int x;
    private int y;

    Point(){
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
