import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to take a break?");
            String userInput = myScanner.nextLine();
            if (userInput.equals("yes")) {
                break;
            }
        }
        System.out.println("Break time!");
    }
}
