package library.management;

public interface LibraryOperations<T> {
    void addItem(T item);
    void removeItem(T item);
    void displayItem();

}
