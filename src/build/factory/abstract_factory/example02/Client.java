package build.factory.abstract_factory.example02;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:23
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.show());
    }

}
