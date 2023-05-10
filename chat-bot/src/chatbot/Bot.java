package chatbot;
import java.util.Scanner;
import java.util.Random;
public class Bot {
//    static String userDrinkInput;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        greeting();
        String name = scanner.nextLine();
        System.out.println("Welcome "+name);

        repeatName();
        String nameRepeated = scanner.nextLine();
        System.out.println("Hi again " +nameRepeated+".");

        guessAge();

        count();

        test();

    }

    public static void greeting(){
        System.out.println("Hello there! What is your name?");
    }

    public static void repeatName(){
        System.out.println("Please repeat your name.");
    }

    public static void guessAge(){
        System.out.println("I'm going to guess your age.");
        System.out.println("Are you older than 35 years old? Yes or no?");
        String answer1 = scanner.nextLine();

        if(answer1.equalsIgnoreCase("yes")){
            System.out.println("Are you older than 50 years old? Yes or no?");
            String answer2 = scanner.nextLine();
                if(answer2.equalsIgnoreCase("yes")){
                int random1 = randomNumber(51, 100);
                    System.out.println("I think you are " +random1);
                }else{
                    int random2 = randomNumber(36, 50);
                    System.out.println("I think you are " +random2);
                }
        }else{
            System.out.println("Are you younger than 20 years old?");
            String answer3 = scanner.nextLine();
                if(answer3.equalsIgnoreCase("yes")){
                    int random3 = randomNumber(10,19);
                    System.out.println("I think you are " +random3);
                }else{
                    int random4 = randomNumber(20, 34);
                    System.out.println("I think you are " +random4);
                }
        }
    }
    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min +1) +min;
    }
    public static void count(){
        System.out.println("Give me a number and I'll count to that number.");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
    public static void test(){
        System.out.println("Uh oh! Pop quiz!");
        System.out.println("Which is not a comparison operator? Select a, b, c, or d.");
        System.out.println("a) ==");
        System.out.println("b) !!");
        System.out.println("c) <=");
        System.out.println("d) >");

        boolean correct = false;
        String correctAnswer = "b";

        while(!correct) {
            String answer = scanner.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct. Great job!");
                correct = true;
            } else {
                System.out.println("Try again.");
            }
        }

    }

}
