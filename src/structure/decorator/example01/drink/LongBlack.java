package structure.decorator.example01.drink;

public class LongBlack extends Coffee{

    public LongBlack(double price, String des) {
        super(price, des);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
