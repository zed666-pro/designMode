package structure.decorator.example01.decoration;

import structure.decorator.example01.drink.Drink;

public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink,2.5,"加入了牛奶");
    }
}
