import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your first number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Hello, what is your second number");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber)
            System.out.println(firstNumber);
        else
            System.out.println(secondNumber);

    }

}
