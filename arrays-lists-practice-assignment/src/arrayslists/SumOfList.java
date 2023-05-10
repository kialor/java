package arrayslists;
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = scanner5.nextInt();
            if (number == 0) {
                break;
            } else {
                list.add(number);
            }
        }
            System.out.print(list.get(0));
            for(int i = 1; i <list.size(); i++){
                System.out.print(", " + list.get(i));
            }
        System.out.print(" were the items in the list. ");

        int total = sum(list);
        System.out.print("The sum of that list is: " +total);
    }
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }
}

