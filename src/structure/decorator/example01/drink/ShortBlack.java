package structure.decorator.example01.drink;

public class ShortBlack extends Coffee{

    public ShortBlack(double price, String des) {
        super(price, des);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
