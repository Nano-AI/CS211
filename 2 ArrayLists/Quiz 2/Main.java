import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(-5, 4, 20));
        boxes.add(new Box(10, 3, 20));
        boxes.add(new Box(-5, 7, 10));
        boxes.add(new Box(10, 2, 10));
        boxes.add(new Box(-1, -1, -1));

        System.out.println("Before:\n" + boxes); // 4 items in list
        removeNegativeVolume(boxes);
        System.out.println(" After:\n" + boxes); // now fewer items
    }


    private static void removeNegativeVolume(ArrayList<Box> boxes) {
        int i = 0;
        while (i < boxes.size()) {
            if (boxes.get(i).getVolume() < 0) {
                boxes.remove(i);
            } else {
                i++;
            }
        }
    }
}