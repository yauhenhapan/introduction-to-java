package by.gapanovich.basics.cycle;

/*
    Task:
    Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

import java.math.BigInteger;

public class Task4 {

    private static final int NUMBER = 200;

    public static void main(String[] args) {
        System.out.println("Product = " + findMultiplySquares(NUMBER));
    }

    public static BigInteger findMultiplySquares(int number){
        BigInteger product = new BigInteger("" + 1);
        for (int i = 1 ; i <= number; i++){
            int temp = i * i;
            product = product.multiply(new BigInteger("" + temp));
        }
        return product;
    }
}
