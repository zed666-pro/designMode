package build.factory.static_factory;

import build.factory.static_factory.SimpleCoffeeFactory;
import build.factory.static_factory.Coffee;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:22
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        return coffee;
    }
}
