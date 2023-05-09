import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int value = Integer.valueOf(scanner.nextLine());
        if (value >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling.");
        }
    }

}
