package structure.decorator.example01.drink;

public class Espress extends Coffee{

    public Espress(double price, String des) {
        super(price, des);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
