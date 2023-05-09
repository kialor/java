import java.util.Scanner;
public class TestScores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("State a number between 0 and 100");
        int num = Integer.valueOf(scanner.nextLine());

        if (num <= 100 && num >= 90) {
            System.out.println("Your grade is an A. Awesome!");
        } else if (num <= 89 && num >= 80){
            System.out.println("Your grade is a B. Bravo.");
        } else if (num <= 79 && num >= 70) {
            System.out.println("Your grade is a C. Could be better...");
        } else if (num <= 69 && num >= 60) {
            System.out.println("Your grade is a D. Devastating!");
        } else if (num <=59 && num >=0) {
            System.out.println("Your grade is an F. Failure :(");
        }else{
            System.out.println("Please enter a number between 0 - 100");
        }
    }
}
