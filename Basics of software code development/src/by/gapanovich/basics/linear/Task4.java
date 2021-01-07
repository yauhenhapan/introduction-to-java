package by.gapanovich.basics.linear;

/*
    Task:
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    private static final double NUMBER = 789.456;

    public static void main(String[] args) {
        System.out.print("Result number = ");
        System.out.printf("%.3f", swapFractionalAndWholeParts(NUMBER));
    }

    private static double swapFractionalAndWholeParts(double number){
        return ( number - Math.floor(number) ) * 1000 + Math.floor(number) * 0.001;
    }
}
