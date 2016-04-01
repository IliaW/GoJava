package flowers;

import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flowers> flowers;

    public Bouquet(ArrayList<Flowers> flowers){
        this.flowers = flowers;
    }

    public ArrayList<Flowers> getFlowers() {
        return flowers;
    }
}