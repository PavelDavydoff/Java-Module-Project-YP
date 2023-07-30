import java.util.Scanner;

public class Calculator {
    public String goodsList = "";
    public double sum = 0;
    public Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            String goods = checkName();
            double price = checkPrice();

            sum += price;
            goodsList = goodsList.concat(goods + ": " + String.format("%.2f", price) + " руб." + "\n");
            System.out.println("Товар успешно добавлен.");
            System.out.println("Добавить ещё товар?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить"))
                break;
        }
    }

    public String checkName() {
        String g;
        System.out.println("Введите название товара:");
        while (true) {
            if (scanner.hasNextDouble()) {
                System.out.println("Введите корректное название.");
                scanner.next();
            } else {
                g = scanner.next();
                break;
            }
        }
        return g;
    }

    public double checkPrice() {
        System.out.println("Введите цену:");
        double p;

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Введите корректное число!");
                scanner.next();
            } else {
                p = scanner.nextDouble();
                if (p < 0) {
                    System.out.println("Введите цену больше нуля!");
                } else break;
            }
        }
        return p;
    }
}
