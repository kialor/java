package arrayslists;
import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args){
        Scanner scanner3 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String input = scanner3.nextLine();
            if(input.isEmpty()){
                System.out.println("The last item in the list is: " +list.get(list.size()-1));
                break;
            }else{
                list.add(input);
            }
        }

    }
}
