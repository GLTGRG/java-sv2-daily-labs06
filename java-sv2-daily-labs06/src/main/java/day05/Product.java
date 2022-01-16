package day05;

public class Product {

    private String name;
    private Type type;
    private double howMuch;

    public Product(String name, Type type, double howMuch) {
        this.name = name;
        this.type = type;
        this.howMuch = howMuch;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getHowMuch() {
        return howMuch;
    }
}
