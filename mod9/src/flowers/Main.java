package flowers;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        Caesar caesar = new Caesar();

        //Encode flowers
        System.out.println("Enter key");
        int key = scanner.nextInt();
        System.out.println("Bouquet(encode):");

        // Preservation of the list of coded text
        ArrayList<String> arrayEncodeFlowers = new ArrayList<>();
        for (Flowers flower : bouquet.getFlowers()) {
            String encode = caesar.encode(flower.getName(), key);
            System.out.println(encode);
            arrayEncodeFlowers.add(encode);
        }
        //Text transcript
        System.out.println("\nEnter key for decrypt");
        int keyDecrypt = scanner.nextInt();
        System.out.println("Bouquet(decrypt):");
        for (String flower : arrayEncodeFlowers) {
            String decrypt = caesar.decrypt(flower, keyDecrypt);
            System.out.println(decrypt);
        }
    }
}