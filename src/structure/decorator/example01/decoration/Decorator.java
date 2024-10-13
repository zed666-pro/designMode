package structure.decorator.example01.decoration;

import structure.decorator.example01.drink.Drink;

public class Decorator extends Drink {

    Drink drink;

    public Decorator(Drink drink, double price, String des) {
        super(price, des);
        this.drink = drink;

    }

    @Override
    public double cost() {
             //配料的价格 + 饮料本身的价格
        return getPrice() + drink.cost();
    }


    @Override
    public String getDes() {
        return drink.getDes() + super.getDes();
    }
}
