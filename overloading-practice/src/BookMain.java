import java.util.Scanner;
import java.util.ArrayList;
public class BookMain {
    public static void main(String[] args){
        Scanner scanner3 = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book ("Twilight", 544, 2005));
        books.add(new Book ("New Moon", 563, 2006));
        books.add(new Book ("Eclipse", 629, 2007));

        System.out.println("Add books to my to reading list!");

        while (true) {
            System.out.println("What is the title?");
            String title = scanner3.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("How many pages?");
            int numPages = scanner3.nextInt();
            scanner3.nextLine();
            System.out.println("What is the publication year?");
            int pubYear = scanner3.nextInt();
            scanner3.nextLine();

            books.add(new Book(title, numPages, pubYear));

        }

        Book book1 = new Book("Breaking Dawn", 756);
        Book book2 = new Book("Midnight Sun");

        books.add(book1);
        books.add(book2);


        System.out.println("What information will be printed?");
        String input = scanner3.nextLine();

        if(input.equalsIgnoreCase("everything")){
            for(Book book: books){
                System.out.println(book);
            }

        }else if (input.equalsIgnoreCase("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }

    }
}
