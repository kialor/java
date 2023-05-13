public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow(String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
        this.genre = "unknown";
    }

    public TvShow(String name){
        this.name = name;
        this.episodes = 0;
        this.genre = "unknown";
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is "+name+ " with " +episodes+ " number of episodes. The genre is " +genre+".";
    }
}
