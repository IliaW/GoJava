package flowers;

import java.util.ArrayList;

public class OutputOnDisplay {
    OutputOnDisplay(ArrayList<Flowers> flowers) {
        System.out.println("     ----------------------------------------------------" +
                "\n" + "     | " + "Class" +
                "\t | " + "Name" +
                "\t          | " + "Color" +
                "\t | " + "Price" + "\t|" + "\n" +
                "     ----------------------------------------------------");
        for (Flowers type : flowers) {
            System.out.print(type);
        }
        System.out.println("     ----------------------------------------------------");
    }
}