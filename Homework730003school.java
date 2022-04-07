package homework;

import java.util.Scanner;

public class Homework730003school {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете брой точки");
        int score;
        score = scanner.nextInt();
        boolean scoreE = (25 <= score && score < 45);
        boolean scoreD = (45 <= score && score < 50);
        if ( 0 < score && score < 25) {
            System.out.println("F");
        }
        if (25 <= score && score < 45) {
            System.out.println("E");
        }
        if (45 <= score && score < 50) {
            System.out.println("D");
        }
        if (50 <= score && score < 60) {
            System.out.println("C");
        }
        if (60 <= score && score < 80) {
            System.out.println("B");
        }
        if  (score >= 80) {
            System.out.println("A");
        }
        }
    }
