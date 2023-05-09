import java.util.Scanner;
public class Calculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        int addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);

        int subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);

        int multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        float division = (float)number1 / (float)number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

        int modulus = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + modulus);
    }
}
