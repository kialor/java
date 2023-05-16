package library.management;

public class LibraryApp {
    public static void main(String[] args){
        Book book1 = new Book("The Hunger Games",2008, "Suzanne Collins","9781407132082");
        Book book2 = new Book("The Maze Runner", 2009, "James Dashner", "9783551313485");
        Book book3 = new Book("Shadow and Bone", 2012, "Leigh Bardugo", "9780805094596");

        DVD dvd1 = new DVD("Wish Dragon", 2021,"Chris Appelhans", 98);
        DVD dvd2 = new DVD("Finding Nemo", 2003, "Andrew Stanton", 100);
        DVD dvd3 = new DVD("Up", 2009, "Pete Docter", 96);

        LibraryManager<LibraryItem> library = new LibraryManager<>();

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);

        library.displayItem();

        library.removeItem(book2);
        library.removeItem(dvd1);

        library.displayItem();

        System.out.println(book1.getItemDetails());
        System.out.println(dvd2.getItemDetails());
        System.out.println(book3.getItemType());
        System.out.println(book3.getAuthor());

    }
}