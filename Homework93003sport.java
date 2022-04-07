package homework;

import java.util.Scanner;

public class Homework93003sport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input clothes, runners or others");
        String clothes;
        String runners;
        String others;
    //    clothes = scanner.nextLine();
    //    runners = scanner.nextLine();
    //    others = scanner.nextLine();
        String product;
        product = scanner.nextLine();
        System.out.println("Input price of the product: ");
        double price;
        price = scanner.nextDouble();
        boolean discountPriceClothes = product.equalsIgnoreCase("clothes");
        boolean discountPriceRunners = product.equalsIgnoreCase("runners");
        boolean discountPriceOthers = product.equalsIgnoreCase("others");
        if ( discountPriceClothes) {
            System.out.println("Намалената цена ще бъде: " + 0.8 * price);
        }
        else if ( discountPriceRunners) {
                System.out.println("Намалената цена ще бъде: " + 0.9 * price);
            }
        else if ( discountPriceOthers) {
                System.out.println("Намалената цена ще бъде: " + 0.95 * price);
            }
            else {
            System.out.println("Грешни данни");
        }


    }
}
