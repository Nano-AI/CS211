/**
 * Song class to store song-specific information
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Song {
    private ArrayList<Artist> artists; // Collection of artists who collaborated on the song
    private Duration length; // Length of the song
    private String name; // Name of the song

    /**
     * @param name Name of the song
     * @param length Length of the song in M:S format
     * @param artists Artists who worked on the song
     */
    public Song(String name, String length, Artist... artists) {
        this.name = name;
        this.artists = new ArrayList<Artist>();
        addArtist(artists);
        setLength(length);
    }

    /**
     * @return Artists who worked on the song
     */
    public ArrayList<Artist> getArtists() {
        return artists;
    }

    /**
     * @param artist Artist to add to song
     */
    public void addArtist(Artist... artist) {
        Collections.addAll(this.artists, artist);
    }

    /**
     * @return Length of the song
     */
    public Duration getLength() {
        return length;
    }

    /**
     * @param length Length of the song in M:S format
     */
    public void setLength(String length) {
        this.length = Utils.stringToDuration(length);
    }

    /**
     * @return Name of the song
     */
    public String getName() {
        return name;
    }

    /**
     * @return String formatted version of the song
     */
    @Override
    public String toString() {
        return String.format("\"%s\" by %s", getName(),
                artists.stream()
                        .map(Artist::toString)
                        .collect(
                                Collectors.joining(", ")
                        ),
                Utils.toString(getLength())
        );
    }
}
