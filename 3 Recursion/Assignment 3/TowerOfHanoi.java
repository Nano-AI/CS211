/**
 * Solves the tower of hanoi problem
 * @author Aditya Bankoti
 * @date July 3, 2024
 */

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;				// Change this to adjust the number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 0) {
            return;
        } else {
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + auxiliary);
            // move from source to empty spot
            towerOfHanoi(n - 1, source, destination, auxiliary);
            // from aux to the destination
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    }
}