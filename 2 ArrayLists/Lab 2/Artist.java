/**
 * Artist class to store artist-specific information
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.util.ArrayList;
import java.util.Collections;

public class Artist {
    private String firstName, lastName; // first + last name
    private ArrayList<Album> albums; // albums made by artist

    /**
     * @param firstName First name of artist
     * @param lastName Last name of artist
     * @param albums Albums made by artist
     */
    public Artist(String firstName, String lastName, Album... albums) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.albums = new ArrayList<Album>();
        addAlbum(albums);
    }

    /**
     * @param firstName Short name for artist
     * @param albums Albums made by artist
     */
    public Artist(String firstName, Album... albums) {
        this(firstName, "", albums);
    }

    /**
     * @return Albums made by artist
     */
    public ArrayList<Album> getAlbums() {
        return this.albums;
    }

    /**
     * @param a Album to add to artist's collection
     */
    public void addAlbum(Album... a) {
        Collections.addAll(this.albums, a);
    }

    /**
     * @return Artist first and last name
     */
    @Override
    public String toString() {
        // artist name
        String name = "";
        // add first name if it isn't empty
        if (!firstName.isEmpty() && !firstName.isBlank()) {
            name += firstName;
        }
        // add last name if it isn't empty
        if (!lastName.isEmpty() && !lastName.isBlank()) {
            // add space if first name isn't empty
            if (!name.isEmpty()) {
                name += " ";
            }
            name += lastName;
        }
        // return name
        return name;
    }
}
