/**
 * Class to store song albums
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

public class Album {
    private ArrayList<Song> songs; // collection of songs
    private String albumName; // album name
    private Duration length; // total length of album in min & sec

    /**
     * @param albumName Name of the album
     * @param songs Songs in the album
     */
    public Album(String albumName, Song... songs) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
        addSong(songs);
    }

    /**
     * @return Time in M:S format
     */
    public Duration getLength() {
        return length;
    }

    /**
     * @param length New length of album in H:M format
     */
    public void setLength(String length) {
        this.length = Utils.stringToDuration(length);
    }

    /**
     * @return The album name
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * @return The songs in the album
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * @param song Songs to add to the album
     */
    public void addSong(Song... song) {
        Collections.addAll(this.songs, song);
    }

    /**
     * @return String format of album
     */
    @Override
    public String toString() {
        return String.format("\"%s\", %s songs [%s]", getAlbumName(), getSongs().size(), Utils.toString(getLength()));
    }
}
