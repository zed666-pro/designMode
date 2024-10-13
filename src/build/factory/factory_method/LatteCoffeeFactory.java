package build.factory.factory_method;

import build.factory.factory_method.Coffee;
import build.factory.factory_method.LatteCoffee;

/**
 * @Author shengaojie
 * @Date 2023/7/26 10:44
 * @ClassName: LatteCoffeeFactory
 * @Description: TODO
 * @Version 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
