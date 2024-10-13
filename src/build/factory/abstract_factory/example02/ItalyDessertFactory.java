package build.factory.abstract_factory.example02;

/**
 * @Author shengaojie
 * @Date 2023/7/26 14:49
 * @ClassName: ItalyDessertFactory
 * @Description: TODO
 * @Version 1.0
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
