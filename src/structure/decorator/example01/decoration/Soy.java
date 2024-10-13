package structure.decorator.example01.decoration;

import structure.decorator.example01.drink.Drink;

public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink,2.0,"加入了豆浆");

    }
}
