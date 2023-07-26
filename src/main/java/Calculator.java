import java.util.Scanner;

public class Calculator {
    public static String goodsList = "";
    public static double sum = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static void calculator(){
        while(true) {
            System.out.println("Введите название товара:");
            String goods;

            while (true) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Введите корректное название.");
                    scanner.next();
                } else {
                    goods = scanner.next();
                    break;
                }
            }

            System.out.println("Введите цену:");
            double price;

            while (true) {
                if (!scanner.hasNextDouble()) {
                    System.out.println("Введите корректное число!");
                    scanner.next();
                } else {
                    price = scanner.nextDouble();
                    break;
                }
            }

            sum += price;
            goodsList = goodsList.concat(goods + ": " + String.format("%.2f", price) + " руб." + "\n");
            System.out.println("Товар успешно добавлен.");
            System.out.println("Добавить ещё товар?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить"))
                break;
        }
    }
}
