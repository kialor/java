import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(10);
        ints.add(15);
        ints.add(15);

        try {
            Set<Integer> integers = new HashSet<>(ints);

            int sum2 = 0;
            for(int numbers2 : integers) {
                sum2 += numbers2;
            }

            double avg2 = (double) sum2 / integers.size();

            System.out.println("Sum of integers w/o duplicates: " + sum2);
            System.out.println("Average of integers w/o duplicates: " + avg2);
            System.out.println(integers);

        }catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }catch (IllegalArgumentException e) {
            System.out.println("Illegal argument.");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }finally{
            System.out.println("Program has ended!");
        }
    }
}
