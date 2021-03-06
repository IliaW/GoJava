package HomeWorkExep_62.instrument;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // Создание ссылки на объект
        MusicShop musicShop = new MusicShop();

        // Создание объектов инструментов
        ArrayList<MusicalInstrument> instruments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 4; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 6; i++) {
            instruments.add(new Trumpet());
        }

        // Сохранение созданных инструментов в список магазина
        musicShop.setInstruments(instruments);

        // Создание списка покупок
        Map<String, Integer> order = new HashMap<>();
        Scanner num = new Scanner(System.in);
        System.out.println("Creating a shopping list");
        System.out.println("How many to buy pianos");
        order.put("piano", num.nextInt());
        System.out.println("How many to buy trumpets");
        order.put("trumpet", num.nextInt());
        System.out.println("How many to buy guitars");
        order.put("guitar", num.nextInt());


        // Вывод на экран всех инструментов в магазине
        System.out.print("All in store: ");
        for (Map.Entry<String, Integer> forNam : order.entrySet()) {
            String musInstruments = forNam.getKey();
            int number = 0;
            for (MusicalInstrument instrument : instruments) {
                if (instrument.getType().equals(musInstruments)) {
                    number++;
                }
            }
            System.out.print(number + " " + musInstruments + "s   ");
        }
        System.out.println("");

        //
        try {
            musicShop.prepareListOfInstrumentsToRemove(order);
            musicShop.removeOrderedInstrumentsFromMusicShop(order);

            // Вывод на экран списка оставшихся в магазине инструментов
            System.out.print("After buying: ");
            for (Map.Entry<String, Integer> forNam : order.entrySet()) {
                String musInstruments = forNam.getKey();
                int number = 0;
                for (MusicalInstrument instrument : instruments) {
                    if (instrument.getType().equals(musInstruments)) {
                        number++;
                    }
                }
                System.out.print(number + " " + musInstruments + "s   ");

            }
        } catch (Exception e) {
            System.out.println("Exception happened: " + e.getMessage());

        }
    }
}