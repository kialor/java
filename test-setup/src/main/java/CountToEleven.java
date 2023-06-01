import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args){
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int value = Integer.valueOf(scanner4.nextLine());
        List<Integer> numbers = generateNumbers(value);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> generateNumbers (int value) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = value; i < 12; i++){
            numbers.add(i);
        }
        return numbers;
    }
}