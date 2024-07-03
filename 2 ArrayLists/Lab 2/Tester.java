/**
 * Main class to include all files
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.time.Duration;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();
        // spotify discovery
        ArrayList<Artist> discovery = new ArrayList<>();
        // add the artists
        discovery.add(dv.kendrickLamar);
        discovery.add(dv.kanyeWest);
        discovery.add(dv.keshi);
        discovery.add(dv.joji);

        // print discovery unsorted
        System.out.println("Before artist alphabetical sort: ");
        discovery.forEach(System.out::println);
        System.out.println();

        // sort discovery
        discovery.sort((a, b) -> a.toString().compareToIgnoreCase(b.toString()));

        // print sorted discovery
        System.out.println("After artist alphabetical sort: ");
        discovery.forEach(System.out::println);
        System.out.println();

        // collection of all songs ready to be played
        ArrayList<Song> allSongs = new ArrayList<>();

        // vinyl record collection
        ArrayList<Album> recordCollection = new ArrayList<>();

        // iterate through every artist in discovery
        discovery.forEach((artist) -> {
            // add all the albums to the vinyl collection
            recordCollection.addAll(artist.getAlbums());

            // add all the songs in each album to the allSongs array
            artist.getAlbums().forEach((album) -> {
                allSongs.addAll(album.getSongs());
            });
        });

        System.out.println("Before length sort: ");
        // print order of every record
        recordCollection.forEach(System.out::println);
        System.out.println();

        // sort decreasing order based off of the total length of the album
        recordCollection.sort((a, b) -> Math.toIntExact(b.getLength().getSeconds() - a.getLength().getSeconds()));
        // reprint the order of record
        System.out.println("After length sort: ");
        recordCollection.forEach(System.out::println);
        System.out.println();

        // duration of queue
        Duration queueDuration = Duration.ZERO;
        // create a spotfiy queue
        ArrayList<Song> queue = new ArrayList<>();

        // iterate through songs and randomly add a song to queue & update queue duration
        for (Song song : allSongs) {
            if (Math.random() <= 0.15) {
                queue.add(song);
                queueDuration = queueDuration.plus(song.getLength());
            }
        }

        // print queue
        System.out.printf("Randomly generated queue [%s]:\n", Utils.toString(queueDuration));
        // randomly sort the queue
        queue.sort((a, b) -> (int) (Math.random() * queue.size()));

        // print the queue
        queue.forEach(System.out::println);
    }
}
