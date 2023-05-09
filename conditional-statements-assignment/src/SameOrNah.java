import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args){
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1 = scanner4.nextLine();

        System.out.println("Enter another word:");
        String word2 = scanner4.nextLine();

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
