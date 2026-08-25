package Problem2;
import java.util.ArrayList;

public abstract class Playlist {
    // variables
    private String name;
    private ArrayList<Song> songList;

    // constructor I
    public Playlist(String n) {
        name = n;
        songList = new ArrayList<>();
    }
    // getters II
    public String getName() {
        return name;
    }
    public ArrayList<Song> getSongList() {
        return songList;
    }

    // concrete methods
    public void addSong(Song s) {
        songList.add(s);
    }

    public void removeSong(Song s) {
        songList.remove(s);
    }

    // abstract methods
    public abstract void playAllSongs();

    public abstract void getVibe();

}
