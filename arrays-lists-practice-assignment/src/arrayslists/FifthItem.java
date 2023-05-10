package arrayslists;

import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("The fifth item in the list is: " +list.get(4));
                break;
            }else {
                list.add(input);
            }
        }

    }
}
