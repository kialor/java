import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Input a number:");
        int value = Integer.valueOf(scanner4.nextLine());

        for(int i=1; i <11; i++){
            int multiply = value * i;
            System.out.println(value+ " x " +i+ " = " +multiply);
        }
    }
}
