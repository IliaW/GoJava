package flowers;

public abstract class Flowers implements Comparable<Flowers> {

    String name, color;
    int price;

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Flowers prices) {
        int flowerPrice = prices.getPrice();
        return this.price - flowerPrice;
    }

    @Override
    public String toString() {
        return  "\t | "  + getClass().getSuperclass().getSimpleName() +
                "\t | "  + getName() +
                "\t  | " + getColor() +
                "\t | "  + getPrice() + "\t    |" + "\n";
    }
}