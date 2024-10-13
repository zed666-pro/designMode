package build.factory.static_factory;

/**
 * @Author shengaojie
 * @Date 2023/7/26 10:11
 * @ClassName: SimpleCoffeeFactory
 * @Description: 咖啡生产的工厂
 * @Version 1.0
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        //声明一个Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException();
        }

        //加配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
