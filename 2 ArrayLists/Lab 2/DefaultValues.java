/**
 * Template artists setup manually
 * @author Aditya Bankoti
 * @date July 2, 2024
 */
public class DefaultValues {
    public Artist kanyeWest; // Kanye West
    public Artist keshi; // Keshi
    public Artist kendrickLamar; // Kendrick Lamar
    public Artist joji;

    public DefaultValues() {
        // setup artists
        kanyeWest = new Artist("Kanye", "West");
        kendrickLamar = new Artist("Kendrick", "Lamar");
        keshi = new Artist("Keshi");
        joji = new Artist("Joji");

        // setup graduation album
        Album graduation = new Album("Graduation");
        graduation.setLength("51:22");
        // setup the life of pablo album
        Album lifeOfPablo = new Album("The Life of Pablo");
        lifeOfPablo.setLength("66:24");
        // setup the bandaids album
        Album bandaids = new Album("Bandaids");
        bandaids.setLength("20:22");
        // setup the damn album
        Album damn = new Album("DAMN");
        damn.setLength("54:54");
        // setup the BALLADS1 album
        Album ballads1 = new Album("BALLADS 1");
        ballads1.setLength("35:11");

        // add songs to graduation
        graduation.addSong(
                new Song("Good Morning", "3:15", kanyeWest),
                new Song("Champion", "2:47", kanyeWest),
                new Song("Stronger", "5:11", kanyeWest),
                new Song("I Wonder", "4:03", kanyeWest),
                new Song("Good Life", "3:27", kanyeWest),
                new Song("Can't Tell Me Nothing", "4:32", kanyeWest),
                new Song("Barry Bonds", "3:24", kanyeWest),
                new Song("Drunk and Hot Girls", "5:13", kanyeWest),
                new Song("Flashing Lights", "3:58", kanyeWest),
                new Song("Everything I Am", "3:47", kanyeWest),
                new Song("The Glory", "3:32", kanyeWest),
                new Song("Homecoming", "3:23", kanyeWest),
                new Song("Big Brother", "4:47", kanyeWest)
        );

        // add songs to the life of pablo
        lifeOfPablo.addSong(
                new Song("Ultralight Beam", "5:20", kanyeWest),
                new Song("Father Stretch My Hands Pt. 1", "2:15", kanyeWest, kendrickLamar),
                new Song("Pt. 2", "2:10", kanyeWest),
                new Song("Famous", "3:16", kanyeWest),
                new Song("Feedback", "2:27", kanyeWest),
                new Song("Low Lights", "2:11", kanyeWest),
                new Song("Highlights", "3:19", kanyeWest),
                new Song("Freestyle 4", "2:03", kanyeWest),
                new Song("I Love Kanye", "0:44", kanyeWest),
                new Song("Waves", "3:01", kanyeWest),
                new Song("FML", "3:56", kanyeWest),
                new Song("Real Friends", "4:11", kanyeWest),
                new Song("Wolves", "5:01", kanyeWest),
                new Song("Frank's Track", "0:38", kanyeWest),
                new Song("Siiiiiiiiilver Surffffeeeeer Intermission", "0:56", kanyeWest),
                new Song("30 Hours", "5:25", kanyeWest),
                new Song("No More Parties in LA", "6:14", kanyeWest), // Duplicate for demonstration
                new Song("Facts (Charlie Heat Version)", "3:20", kanyeWest),
                new Song("Fade", "3:13", kanyeWest)
        );


        // add songs to bandaids
        bandaids.addSong(
                new Song("less of you", "3:41", keshi),
                new Song("bandaids", "3:23", keshi),
                new Song("blue", "3:34", keshi),
                new Song("alright", "2:40", keshi),
                new Song("more", "2:27", keshi),
                new Song("right here", "4:37", keshi)
        );

        // add songs to damn album
        damn.addSong(
                new Song("BLOOD.", "1:58", kendrickLamar),
                new Song("DNA.", "3:06", kendrickLamar),
                new Song("YAH.", "2:40", kendrickLamar),
                new Song("ELEMENT.", "3:29", kendrickLamar),
                new Song("FEEL.", "3:35", kendrickLamar),
                new Song("LOYALTY.", "3:47", kendrickLamar),
                new Song("PRIDE.", "4:35", kendrickLamar),
                new Song("HUMBLE.", "2:57", kendrickLamar),
                new Song("LUST.", "5:07", kendrickLamar),
                new Song("LOVE.", "3:33", kendrickLamar),
                new Song("XXX.", "4:14", kendrickLamar),
                new Song("FEAR.", "7:41", kendrickLamar),
                new Song("GOD.", "4:09", kendrickLamar),
                new Song("DUCKWORTH.", "4:08", kendrickLamar)
        );

        // add songs to ballads
        ballads1.addSong(
                new Song("ATTENTION", "2:22", joji),
                new Song("SLOW DANCING IN THE DARK", "3:29", joji),
                new Song("TEST DRIVE", "2:59", joji),
                new Song("WANTED U", "4:08", joji),
                new Song("CAN'T GET OVER YOU (feat. Clams Casino)", "2:31", joji),
                new Song("YEAH RIGHT", "3:08", joji),
                new Song("WHY AM I STILL IN LA", "3:37", joji),
                new Song("NO FUN", "3:27", joji),
                new Song("COME THRU", "3:03", joji),
                new Song("R.I.P. (feat. Trippie Redd)", "2:34", joji),
                new Song("XNXX", "2:53", joji),
                new Song("I'LL SEE YOU IN 40", "5:38", joji)
        );


        // add albums to respective artist
        kendrickLamar.addAlbum(damn);
        kanyeWest.addAlbum(graduation);
        kanyeWest.addAlbum(lifeOfPablo);
        keshi.addAlbum(bandaids);
        joji.addAlbum(ballads1);
    }
}
