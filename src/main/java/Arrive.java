import java.util.Scanner;

public class Arrive {
    Arrive() {
        Scanner scanner = new Scanner(System.in);
        int guestsCount;
        System.out.println("Введите количество гостей");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введите корректное число!");
                scanner.next();
                continue;
            }

            guestsCount = scanner.nextInt();
            if (guestsCount <= 1) {
                System.out.println("Введите корректное количество гостей(больше одного)!");
                continue;
            }

            break;
        }

        Calculator calculator = new Calculator();
        calculator.start();
        System.out.println("Добавленные товары:");
        System.out.println(calculator.goodsList);
        double pricePerPerson = calculator.sum / guestsCount;

        String postfix;
        int rounded = (int)Math.floor(pricePerPerson);
        int lastDigit = rounded % 10;
        int lastDigits = rounded % 100;
        if (lastDigits >= 11 && lastDigits <=19){
            postfix = "ей.";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            postfix = "я.";
        } else if (lastDigit == 1) {
            postfix = "ь.";
        } else {
            postfix = "ей.";
        }
        System.out.println("По " + String.format("%.2f", pricePerPerson) + " рубл" + postfix);
    }
}
