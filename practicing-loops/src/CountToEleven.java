import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args){
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int value = Integer.valueOf(scanner4.nextLine());
        for(int i = value; i < 12; i++){
            System.out.println(i);
        }
    }
}
