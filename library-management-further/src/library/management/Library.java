package library.management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void addUser(User user) {users.add(user);}

    public void removeBook(String title){
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> findByYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author) {
        Predicate<Book> byAuthor = book -> book.getAuthor().equalsIgnoreCase(author);
        return books.stream()
                .filter(byAuthor)
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages(){
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);

    }

    public List<Book> findBookWithMoreThanNPages(int n){
        Predicate<Book> moreThanNPages = book -> book.getPages() > n;
        return books.stream()
                .filter(moreThanNPages)
                .collect(Collectors.toList());

    }

    public void booksSortedAlphabetically(){
        Comparator<Book> byTitle = Comparator.comparing(Book::getTitle);
        books.stream()
                .sorted(byTitle)
                .map(Book::getTitle)
                .forEach(System.out::println);

    }

    public List<Book> findByCategory(String category){
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());

    }


    public void loanBook(User user, Book book){
        if(!book.isOnLoan()){
            book.setOnLoan(true);
            user.getBooksLoaned().add(book);
            LocalDate dueDate = LocalDate.now().plusWeeks(2);
            book.setDueDate(dueDate);
            System.out.println(book.getTitle() + " has been loaned to " + user.getName() + ".");
            System.out.println("Due date: " + dueDate);
        }else {
            System.out.println(book.getTitle() + " is already on loan.");
        }
    }

    public void returnBook(User user, Book book) {
        if (user.getBooksLoaned().contains(book)) {
            book.setOnLoan(false);
            user.getBooksLoaned().remove(book);
            System.out.println(book.getTitle() + " has been returned by " + user.getName() + ".");
        } else {
            System.out.println(book.getTitle() + " is not currently loaned.");
        }
    }

    public User findUserByLibraryCardNumber(int libraryCardNumber) {
        for (User user : users) {
            if (user.getLibraryCardNumber() == libraryCardNumber) {
                return user;
            }
        }
        return null;
    }

    public void setDueDate(Book book) {
        LocalDate dueDate = LocalDate.now().plusWeeks(2);
        book.setDueDate(dueDate);
    }


    public List<Book> findUserOverdueBooks(int libraryCardNumber) {
        List<Book> overdueBooks = new ArrayList<>();
        User user = findUserByLibraryCardNumber(libraryCardNumber);
        if (user != null) {
            for (Book book : user.getBooksLoaned()) {
                if (book.isBookOverdue()) {
                    overdueBooks.add(book);
                }
            }
        }
        return overdueBooks;
    }

    public double calcLateFee(Book book){
        LocalDate dueDate = book.getDueDate();
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
        return daysOverdue * 0.25;
    }

    public void printLateFee(int userLibraryCardNumber){
        User user = findUserByLibraryCardNumber(userLibraryCardNumber);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        List<Book> userOverdueBooks = findUserOverdueBooks(userLibraryCardNumber);

        double totalLateFees = 0.0;
        for (Book book : userOverdueBooks) {
            double lateFee = calcLateFee(book);
            totalLateFees += lateFee;
        }

        System.out.println("Total late fees for user " + userLibraryCardNumber + ": $" + totalLateFees);
    }

    @Override
    public String toString() {
        return "Library" +
                " books=" + books;
    }
}
