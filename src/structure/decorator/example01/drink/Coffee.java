package structure.decorator.example01.drink;

public class Coffee extends Drink{

    public Coffee(double price, String des) {
        super(price, des);
    }

    @Override
    public double cost() {
       return getPrice();
    }
}
