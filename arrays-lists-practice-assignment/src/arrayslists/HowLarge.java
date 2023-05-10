package arrayslists;
import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args){
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String input = scanner2.nextLine();
            if(input.isEmpty()){
                System.out.println("The total amount of items in the list was: " +list.size());
                break;
            }else{
                list.add(input);
            }
        }
    }
}
