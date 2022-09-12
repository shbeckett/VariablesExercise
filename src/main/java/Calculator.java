import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your first number?");
        float num1 = scanner.nextInt();
        System.out.println("Hello, what is your second number");
        float num2 = scanner.nextInt();
        System.out.println("Hello, please choose an operator(+, -, / or *)");
        String operator = scanner.nextLine();
        float result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Oops - not a valid operator");
        }
    }
}
