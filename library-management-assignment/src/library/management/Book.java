package library.management;

public class Book extends LibraryItem {
    private String author;
    private String iSBN;

    public Book(String title, int releaseYear, String author, String iSBN) {
        super(title, releaseYear);
        this.author = author;
        this.iSBN = iSBN;
    }

    @Override
    String getItemType() {
        return "Book";
    }

    @Override
    String getItemDetails() {
        return "Title: "+getTitle()+ " Author: "+author+ " Year released: " +releaseYear+ " ISBN: "+iSBN;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return iSBN;
    }
}

