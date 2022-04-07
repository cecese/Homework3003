package homework;

import java.util.Scanner;

public class Homework63003square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете дължина:");
        int height;
        height = scanner.nextInt();
        System.out.println("Въведете широчина:");
        int weight;
        weight = scanner.nextInt();
        boolean square = height == weight;
        if ( square) {
            System.out.println("Фигурата е квадрат");
        }
        else {
            System.out.println("Фигурата е правоъгълник");
        }

    }
}
