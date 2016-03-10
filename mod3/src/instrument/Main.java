package instrument;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Adding objects
        MusicalInstrument guitar = new Guitar("Guitar");
        MusicalInstrument piano = new Piano("Piano");
        MusicalInstrument trumpet = new Trumpet("Trumpet");

        // Creating instruments array
        ArrayList<MusicalInstrument> musicalInstruments = new ArrayList<>();
        musicalInstruments.add(guitar);
        musicalInstruments.add(piano);
        musicalInstruments.add(trumpet);

        // Creating musicShop object and setting the instruments array
        MusicShop musicShop = new MusicShop();
        musicShop.setInstruments(musicalInstruments);

        // Print instruments from musicShop
        System.out.println("Musical Instruments:");
        for (MusicalInstrument musicalInstrument : musicShop.getInstruments()) {
            System.out.println(musicalInstrument.getName());
        }
    }
}