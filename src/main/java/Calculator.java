import java.util.Scanner;

public class Calculator {
    public String goodsList = "";
    public double sum = 0;
    public Scanner scanner = new Scanner(System.in);
    public void start(){
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
