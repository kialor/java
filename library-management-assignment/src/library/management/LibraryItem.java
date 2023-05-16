package library.management;

abstract class LibraryItem {
    String title;
    int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    abstract String getItemType();

    abstract String getItemDetails();

}

