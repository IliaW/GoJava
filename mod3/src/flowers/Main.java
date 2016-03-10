package flowers;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Adding objects
        Flowers aster = new Aster("Aster");
        Flowers chamomile = new Chamomile("Chamomile");
        Flowers rose = new Rose("Rose");
        Flowers tulip = new Tulip("Tulip");

        // Creating flowers array
        ArrayList<Flowers> flowers = new ArrayList<>();
        flowers.add(aster);
        flowers.add(chamomile);
        flowers.add(rose);
        flowers.add(tulip);

        // Creating bouquet object and setting the flowers array
        Bouquet bouquet = new Bouquet(flowers);

        // Print flowers from bouquet
        System.out.println("Bouquet:");
        for (Flowers flower :bouquet.getFlowers()){
            System.out.println(flower.getName());
        }
    }
}