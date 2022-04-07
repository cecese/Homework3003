package homework;

import java.util.Scanner;

public class Homework133003cinema {
    public static void main(String[] args) {
        int pension = 2;
        int adult = 2;
        int student = 1;
        int teenager = 1;
        int child = 1;
        Scanner scanner = new Scanner(System.in);
        int ticket;
        System.out.println("Въведете цена на билет за кино: ");
        ticket = scanner.nextInt();
        System.out.println("Семейството ще плати за прожекцията общо: " + (pension * 0.9 * ticket +
                adult * ticket + student * 0.7 * ticket + teenager * 0.5 * ticket +
                child * 0.5 * ticket));
    }
}
