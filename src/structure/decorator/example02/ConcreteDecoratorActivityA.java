package structure.decorator.example02;

/**
 * @description: 具体的装者类A
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class ConcreteDecoratorActivityA extends DecoratorActivity{

    @Override
    public void doThisWork() {
        System.out.println("先刷牙...");
        System.out.println("在洗头...");
        activity.doThisWork();
        System.out.println("早饭带到实验室吃....");
    }
}
