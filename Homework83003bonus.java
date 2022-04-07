package homework;

import java.util.Scanner;

public class Homework83003bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        int salary;
        System.out.println("Въведете трудов стаж във фирмата");
        age = scanner.nextInt();
        System.out.println("Въведете заплата");
        salary = scanner.nextInt();
        if ( 5 <= age && age < 10) {
            System.out.println("Вашият бонус ще бъде: " + 0.05 * salary);
        }
        else if ( 10 <= age && age < 15) {
            System.out.println("Вашият бонус ще бъде: " + 0.07 * salary);
        }
        else  if ( age >= 15){
            System.out.println("Вашият бонус ще бъде: " + 0.1 * salary);
        }
        else {
            System.out.println("Нямате достатъчно стаж за да получите бонус");
        }
    }
}
