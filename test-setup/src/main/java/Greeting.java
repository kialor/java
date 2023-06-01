import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        String greeting = printGreeting(name);
        System.out.println(greeting);

    }

    public static String printGreeting(String name){
        return "Hi " + name;
    }
}