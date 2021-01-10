package by.gapanovich.basics.cycle;

/*
    Task:
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("ASCII table symbols");
        printSymbolsASCIITable();
    }

    public static void printSymbolsASCIITable(){
        for (int i = 32; i <= 126; i++){
            System.out.println(i + " = " + (char)i);
        }
    }
}
