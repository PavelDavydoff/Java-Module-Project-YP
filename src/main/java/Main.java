import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount;
        System.out.println("Введите количество гостей");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введите целое число!");
                scanner.next();
                continue;
            }

            int g = scanner.nextInt();
            if (g <= 1) {
                System.out.println("Введите корректное количество гостей(больше одного)!");
                continue;
            }

            guestsCount = g;
            break;
        }
        Calculator.calculator();
        System.out.println("Добавленные товары:");
        System.out.println(Calculator.goodsList);
        double pricePerPerson = Math.floor(Calculator.sum/guestsCount);
        String postfix;
        int lastDigit = (int)pricePerPerson%10;
        if (lastDigit >= 2  && lastDigit <= 4 ){
            postfix = "я.";
        } else if (lastDigit == 1){
            postfix = "ю.";
        } else {
            postfix = "ей.";
        }
        System.out.println("По " + String.format("%.2f", pricePerPerson) + " рубл" + postfix);
    }
}