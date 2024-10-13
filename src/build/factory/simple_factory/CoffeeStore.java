package build.factory.simple_factory;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:22
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        return coffee;
    }
}
