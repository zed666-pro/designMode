package build.factory.factory_method;

import build.factory.factory_method.CoffeeFactory;
import build.factory.factory_method.Coffee;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:22
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
}
