/**
 * Utils class for some useful functions
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.time.Duration;

public class Utils {
    /**
     * @param length Length of the song in M:S format
     * @return Duration derived from the length parameter
     */
    public static Duration stringToDuration(String length) {
        String[] values = length.split(":");
        Duration d = Duration.ofMinutes(Integer.parseInt(values[0]));
        d = d.plusSeconds(Integer.parseInt(values[1]));
        return d;
    }

    /**
     * @param d Duration
     * @return String in M:S format
     */
    public static String toString(Duration d) {
        return String.format("%d:%0,2d", d.toMinutes(), d.toSeconds() % 60);
    }
}
