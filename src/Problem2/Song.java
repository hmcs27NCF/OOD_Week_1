package Problem2;

public class Song {
    // variables
    private String title;
    private String artist;
    private String duration;

    // constructor I
    public Song(String t, String a, String d) {
        title = t;
        artist = a;
        duration = d;
    }
    // getters II
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getDuration() {
        return duration;
    }
}
