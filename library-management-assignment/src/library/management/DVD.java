package library.management;

public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    String getItemType() {
        return "DVD";
    }

    @Override
    String getItemDetails() {
        return "Title: "+getTitle()+ " Director: "+director+ " Year released: " +releaseYear+ " Duration: "+duration+ " minutes";
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
}
