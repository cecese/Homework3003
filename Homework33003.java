package homework;

public class Homework33003 {
    public static void main(String[] args) {
        double balance = 120;
        int score = 8;
        if (score >= 8 ) {
            balance = balance + 50;
        }
        if (score >6) {
            balance = balance + 20;
        }
        else {
            balance = balance - 10;
        }
        System.out.println(balance);
    }
}
