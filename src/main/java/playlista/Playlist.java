package playlista;

import java.time.Duration;

public class Playlist {

    static int playlistLength(Song... songs) {
        int length = 0;
        for (Song song : songs) {
            length += song.getLength();
        }
        return length;
    }

    static void printInfo(int playlistLength) {
        Duration duration = Duration.ofSeconds(playlistLength);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();

        System.out.printf("Wszystkie pioosenki trwają: %d sekund, czyli: \n %d:%d:%d",
                playlistLength, hours, minutes, seconds);
    }
}
