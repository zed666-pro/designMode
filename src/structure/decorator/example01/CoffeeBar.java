package structure.decorator.example01;

import structure.decorator.example01.decoration.Chocolate;
import structure.decorator.example01.decoration.Milk;
import structure.decorator.example01.drink.Drink;
import structure.decorator.example01.drink.LongBlack;

public class CoffeeBar {

    public static void main(String[] args) {
                // 点一份咖啡
                Drink order = new LongBlack(5.0,"美式咖啡");
                System.out.println(order.cost() + "$\t" + order.getDes());

                // 加一份牛奶
                order = new Milk(order);
                System.out.println(order.cost() + "$\t" + order.getDes());

                // 加两份巧克力
                order = new Chocolate(order);
                System.out.println(order.cost() + "$\t" + order.getDes());
                order = new Chocolate(order);
                System.out.println(order.cost() + "$\t" + order.getDes());
    }
}
