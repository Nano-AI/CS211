import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Fibonacci {
    public static LinkedList<Integer> fibonacci(int n) {
        LinkedList<Integer> sequence = new LinkedList<>();
        if (n == 0) {
            return sequence;
        }
        sequence.add(0);
        if (n == 1) {
            return sequence;
        }
        sequence.add(1);
        if (n == 2) {
            return sequence;
        }

        int a = 0, b = 1, c;

        for (int i = 2; i < n; i++) {
            c = a + b;
            sequence.add(c);
            a = b;
            b = c;
        }

        return sequence;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(13));
    }
}
