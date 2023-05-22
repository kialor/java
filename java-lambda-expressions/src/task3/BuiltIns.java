package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltIns {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Purse", 80));
        items.add(new Item("Shirt", 25));
        items.add(new Item("Shoes", 160));
        items.add(new Item("Hat", 15));

        Predicate<Item> expensive = item -> item.getPrice() > 50;
        Function<Item, String> upperCase = item -> item.getName().toUpperCase();
        Consumer<Item> display = item -> System.out.println(item);
        Supplier<Item> supply = () -> new Item("Socks", 5);

        System.out.println("Items over $50: ");
        items.stream()
                .filter(expensive)
                .forEach(display);
        System.out.println();


        System.out.println("Uppercased item names: ");
        items.stream()
                .map(upperCase)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("New item added:");
        Item newItem = supply.get();
        items.add(newItem);
        System.out.println(newItem);


    }
}
