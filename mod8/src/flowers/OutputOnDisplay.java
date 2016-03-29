package flowers;

import java.util.TreeSet;

public class OutputOnDisplay {
    OutputOnDisplay(TreeSet<Flowers> flowers) {
        System.out.println("     ----------------------------------------------------" +
                "\n" + "     | " + "Class" +
                "\t | "          + "Name" +
                "\t          | " + "Color" +
                "\t | "          + "Price" +
                "\t|" + "\n" +
                "     ----------------------------------------------------");
        flowers.forEach(System.out::print);
        System.out.println("     ----------------------------------------------------");
    }
}