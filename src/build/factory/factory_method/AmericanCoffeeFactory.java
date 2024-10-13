package build.factory.factory_method;

import build.factory.factory_method.AmericanCoffee;
import build.factory.factory_method.Coffee;

/**
 * @Author shengaojie
 * @Date 2023/7/26 10:43
 * @ClassName: AmericanCoffeeFactory
 * @Description: TODO
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
