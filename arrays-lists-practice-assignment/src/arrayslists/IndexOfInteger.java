package arrayslists;
import java.util.Scanner;
import java.util.ArrayList;
public class IndexOfInteger {
    public static void main(String[] args){
        Scanner scanner4 = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int input = scanner4.nextInt();
            if(input ==0){
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");

                int number = scanner4.nextInt();

                for (int i=0; i < list.size(); i++ ){
                    if(list.get(i) == number){
                        System.out.println(number+ " is at index " +i);
                    }
                }
                break;
            } else {
                list.add(input);
            }
        }

    }
}
