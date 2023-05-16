package library.management;
import java.util.ArrayList;
public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {

    private ArrayList<T> list;

    public LibraryManager(){
        list = new ArrayList<>();
    }


    @Override
    public void addItem(T item) {
        list.add(item);
        System.out.println("Item added: " +item.getTitle());

    }

    @Override
    public void removeItem(T item) {
        if(list.remove(item)) {
            System.out.println("Item removed: " +item.getTitle());
        }else{
            System.out.println("Item not found: " +item.getTitle());
        }
    }

    @Override
    public void displayItem() {
        System.out.println("Items in library: ");
        for (T item : list) {
            System.out.println(item.getTitle());
        }
    }
}
