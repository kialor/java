public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.year = 0;
    }

    public Book(String title) {
        this.title = title;
        this.pages = 0;
        this.year = 0;
    }


    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title+", " +pages+ " pages, " +year;
    }
}
