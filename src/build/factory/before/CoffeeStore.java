package build.factory.before;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:22
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //生命一个Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
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
