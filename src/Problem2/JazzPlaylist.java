package Problem2;
import java.util.ArrayList;

public class JazzPlaylist extends Playlist {
    // constructor I
    public JazzPlaylist(String name) {
        super(name);
    }

    // methods
    public ArrayList<Song> songList() {
        return super.getSongList();
    }

    @Override
    public void playAllSongs() {
        System.out.printf("\nNow playing: %s (Jazz)", super.getName());
        for (int i = 0; i < songList().size(); i++) {
            System.out.printf("\n%s by %s / %s", songList().get(i).getTitle(), songList().get(i).getArtist(), songList().get(i).getDuration());
        }
        System.out.println("\nPlaylist End\n");
    }

    @Override
    public void getVibe() {
        System.out.println("Vibe: Soulful and melodic\n");
    }
}
