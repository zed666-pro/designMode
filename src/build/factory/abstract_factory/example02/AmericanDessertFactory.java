package build.factory.abstract_factory.example02;

/**
 * @Author shengaojie
 * @Date 2023/7/26 14:47
 * @ClassName: AmericanDessertFactory
 * @Description: TODO
 * @Version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }


    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
