package build.factory.abstract_factory.example02;

/**
 * @Author shengaojie
 * @Date 2023/7/26 14:46
 * @ClassName: DessertFactory
 * @Description: TODO
 * @Version 1.0
 */
public interface DessertFactory {

    public Coffee createCoffee();
    public Dessert createDessert();
}
