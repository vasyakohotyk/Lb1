import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть операцію (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Помилка: Ділення на 0 неможливе.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Помилка: Невірний знак операції.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
