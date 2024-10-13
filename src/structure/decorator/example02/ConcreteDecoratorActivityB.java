package structure.decorator.example02;

/**
 * @description: 具体的装饰者B
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class ConcreteDecoratorActivityB extends DecoratorActivity {

    @Override
    public void doThisWork() {
        System.out.println("先刷牙...");
        System.out.println("不洗头...");
        System.out.println("在食堂吃泡面...");
        activity.doThisWork();
    }
}
