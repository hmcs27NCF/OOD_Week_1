package Problem2;
import java.util.ArrayList;

public class Problem2_Main {
    public static void main(String[] args) {
        Song pop1 = new Song("Running Away", "BADBADNOTGOOD", "2:18");
        Song pop2 = new Song("Glimpse of Us", "Joji", "3:20");

        Song rock1 = new Song("You May Be Right", "Billy Joel", "4:15");
        Song rock2 = new Song("Hound Dog Gaming Phonk Remix", "Extreme Presley", "4:20");

        Song jazz1 = new Song("Paper Moon", "Nat King Cole", "4:00");
        Song jazz2 = new Song("Take 5", "Dave Brubeck", "5:24");

        Playlist p1 = new PopPlaylist("Popping Off");
        Playlist p2 = new RockPlaylist("Rocking Out");
        Playlist p3 = new JazzPlaylist("Jazz Hands");

        p1.addSong(pop1);
        p1.addSong(pop2);
        p2.addSong(rock1);
        p2.addSong(rock2);
        p3.addSong(jazz1);
        p3.addSong(jazz2);

        p1.playAllSongs();
        p1.getVibe();
        p2.playAllSongs();
        p2.getVibe();
        p3.playAllSongs();
        p3.getVibe();
    }
}
