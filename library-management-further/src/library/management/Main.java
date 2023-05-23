package library.management;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("The Psychology of Stupidity", "Jean-Francois Marmion", 2018, 384, "non-fiction", false);
        Book book2 = new Book("Becoming", "Michelle Obama", 2018, 448, "non-fiction", false);
        Book book3 = new Book("It Ends with Us", "Colleen Hoover", 2016, 376, "fiction", false);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 208, "fiction", false);

        User user1 = new User("Jon Snow", 87667, new ArrayList<>());
        User user2 = new User("Arya Stark", 14234, new ArrayList<>());
        User user3 = new User("Theon Greyjoy", 7464, new ArrayList<>());


        Library myLibrary = new Library();
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        myLibrary.addUser(user1);
        myLibrary.addUser(user2);
        myLibrary.addUser(user3);


        System.out.println("Books by Michelle Obama:");
        List<Book> booksByAuthor = myLibrary.findByAuthor("Michelle Obama");
        Consumer<Book> bookTitle = book -> System.out.println(book.getTitle());
        booksByAuthor.forEach(bookTitle);

        System.out.println("Non-fiction books: ");
        List<Book> booksByCategory = myLibrary.findByCategory("non-fiction");
        Consumer<Book> bookCategory = book -> System.out.println(book.getTitle());
        booksByCategory.forEach(bookCategory);

        System.out.println("Books in library sorted alphabetically: ");
        myLibrary.booksSortedAlphabetically();

        System.out.println("Books over 380 pages: ");
        List<Book> booksWithMoreThanNPages = myLibrary.findBookWithMoreThanNPages(380);
        Consumer<Book> bookOverPages = book -> System.out.println(book.getTitle()+" with "+book.getPages()+ " pages");
        booksWithMoreThanNPages.forEach(bookOverPages);

        System.out.println("Book with most pages: ");
        Book bookWithMostPages = myLibrary.findBookWithMostPages();
        System.out.println(bookWithMostPages.getTitle());


        myLibrary.loanBook(user1,book2);
        myLibrary.loanBook(user2,book2);

        myLibrary.printLateFee(user1.getLibraryCardNumber());

        myLibrary.returnBook(user1,book2);


    }
}
