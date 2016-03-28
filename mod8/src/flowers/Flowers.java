package flowers;

public abstract class Flowers {

    String name, color;

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    int price;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\t | " + getClass().getSuperclass().getSimpleName() +
                "\t | " + getName() +
                "\t  | " + getColor() +
                "\t | " + getPrice() + "\t    |" + "\n";
    }
}