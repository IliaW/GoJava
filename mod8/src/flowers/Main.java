package flowers;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // Creating flowers array
        TreeSet<Flowers> flowers = new TreeSet<>();
        flowers.add(new Aster("Aster    ", "violet", 1500));
        flowers.add(new Aster("Aster    ", "white", 190));
        flowers.add(new Chamomile("Chamomile", "white", 999));
        flowers.add(new Chamomile("Chamomile", "white", 200));
        flowers.add(new Rose("Rose     ", "red ", 500));
        flowers.add(new Rose("Rose     ", "rose", 600));
        flowers.add(new Tulip("Tulip    ", "blue", 2000));
        flowers.add(new Tulip("Tulip    ", "yellow", 1000));

        // Output on display array flowers
        new OutputOnDisplay(flowers);
    }
}