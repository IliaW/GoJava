package flowers;

public abstract class Flowers implements Comparable<Flowers> {

    String name, color;
    int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        int flowerPrice = ((Flowers)prices).getPrice();
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