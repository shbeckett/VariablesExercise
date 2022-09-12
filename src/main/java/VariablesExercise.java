import java.util.Scanner;
public class VariablesExercise {
    public static void main(String[] args) {
        /* String firstName = "Sarah";
        String lastName = "Beckett";
        String name = firstName + " " + lastName;
        System.out.println(name);

        float num1 = 7;
        int num2 = 17;
        System.out.println(num1 + num2);
        float result = (num1 / num2);
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("Hello, what is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);



    }
}
