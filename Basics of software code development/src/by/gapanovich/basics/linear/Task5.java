package by.gapanovich.basics.linear;

/*
    Task:
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        try{
            System.out.print("Enter time in seconds:");
            int seconds = enterSeconds(System.in);
            if(areCorrectSeconds(seconds)){
                System.out.println("Time:" + convertTimeFromSecondsToHours(seconds) + "ч " +
                        convertTimeFromSecondsToMinutes(seconds) + "м " +
                        convertTimeToSeconds(seconds) + "c.");
            } else {
                throw new IOException("They value of seconds is not correct!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int enterSeconds(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    public static int convertTimeFromSecondsToHours(int seconds){
        if (seconds < 3600){
            return 0;
        }
        return seconds / 3600;
    }

    public static int convertTimeFromSecondsToMinutes(int seconds){
        if (seconds < 60){
            return 0;
        }
        return (seconds - convertTimeFromSecondsToHours(seconds) * 3600) / 60;
    }

    public static int convertTimeToSeconds(int seconds){
        return seconds - (convertTimeFromSecondsToHours(seconds) * 3600) - (convertTimeFromSecondsToMinutes(seconds) * 60);
    }

    public static boolean areCorrectSeconds(int seconds){
        return seconds >= 0;
    }
}
