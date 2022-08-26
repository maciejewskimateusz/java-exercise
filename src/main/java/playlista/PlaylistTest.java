package playlista;

public class PlaylistTest {
    public static void main(String[] args) {

        Song song1 = new Song("Ulalala", 5600);
        Song song2 = new Song("Nothing else matters", 2003);

        int playlistLength = Playlist.playlistLength(song1, song2);
        Playlist.printInfo(playlistLength);

    }


}
