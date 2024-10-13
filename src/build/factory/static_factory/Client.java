package build.factory.static_factory;

import build.factory.static_factory.Coffee;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:23
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //1. 创建一个CoffeeStore类
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }

}
