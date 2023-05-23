package library.management;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int libraryCardNumber;
    private List<Book> booksLoaned;

    public User(String name, int libraryCardNumber, List<Book> booksLoaned) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksLoaned = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getBooksLoaned() {
        return booksLoaned;
    }

    public void setBooksLoaned(List<Book> booksLoaned) {
        this.booksLoaned = booksLoaned;
    }


}
