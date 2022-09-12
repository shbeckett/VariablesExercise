import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your first number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Hello, what is your second number");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber)
            System.out.println(firstNumber);
        else
            System.out.println(secondNumber);
        System.out.println("Give me another number?");
        int newNumber = scanner.nextInt();
        if (newNumber%2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
        System.out.println("Give me a traffic light colour?");
        String colour = scanner.nextLine();
        System.out.println(colour);
        if (colour == "green")
            System.out.println("Go!");
        else if (colour == "red")
            System.out.println("Go!");
        else if (colour == "amber")
            System.out.println("Go!");
            */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is the number of your month?");
        int num1 = scanner.nextInt();
               switch (num1) {
                   case 3: case 4: case 5:
                        System.out.println("Spring");
                        break;
                   case 6: case 7: case 8:
                        System.out.println("Summer");
                        break;
                   case 9: case 10: case 11:
                       System.out.println("Autumn");
                       break;
                   case 12: case 1: case 2:
                       System.out.println("Summer");
                       break;
                   default:
                        System.out.println("Oops, that is not a month!");
        }
    }

}
