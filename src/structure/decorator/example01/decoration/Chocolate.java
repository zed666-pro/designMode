package structure.decorator.example01.decoration;

import structure.decorator.example01.drink.Drink;

public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink,1.5,"加入了巧克力");
    }
}
