import java.util.Scanner;
import java.util.ArrayList;
public class MainTvShow {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();

        while(true) {
            System.out.println("Name of show:");
            String showName = scanner1.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int numEpisodes = scanner1.nextInt();
            scanner1.nextLine();

            System.out.println("What is the genre?");
            String showGenre = scanner1.nextLine();

            shows.add(new TvShow(showName, numEpisodes, showGenre));
        }

        TvShow show1 = new TvShow("Criminal Minds", 324,"crime");
        TvShow show2 = new TvShow("Lost", 121);
        TvShow show3 = new TvShow("Bones");

        shows.add(show1);
        shows.add(show2);
        shows.add(show3);

        for (TvShow show: shows){
            System.out.println(show);
        }
    }


}
