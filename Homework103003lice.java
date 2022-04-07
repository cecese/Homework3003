package homework;

import java.util.Scanner;

public class Homework103003lice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете дължина:");
        int height;
        height = scanner.nextInt();
        System.out.println("Въведете широчина:");
        int weight;
        weight = scanner.nextInt();
        boolean square = height == weight;
        if ( height > 0 && weight > 0) {

            if (square) {
                System.out.println("Фигурата е квадрат");
                System.out.println("Обиколката на фигурата е: " + (2 * height + 2 * weight));
                System.out.println("Лицето на фигурата е: " + (height * height));
            } else  if (! square){
                System.out.println("Фигурата е правоъгълник");
                System.out.println("Обиколката на фигурата е: " + (2 * height + 2 * weight));
                System.out.println("Лицето на фигурата е: " + (height * weight));
            }

            } else {
            System.out.println("Невалидни данни");
        }
    }
}
