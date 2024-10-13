package structure.decorator.example02;

/**
 * @description: 客户端测试
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Client {

    public static void main(String[] args) {
        People1 people1 = new People1();
        People2 people2 = new People2();

        //创建具体的装饰者类
        DecoratorActivity decoratorActivityA = new ConcreteDecoratorActivityA();
        DecoratorActivity decoratorActivityB = new ConcreteDecoratorActivityB();
        decoratorActivityA.setActivity(people1);
        decoratorActivityB.setActivity(people2);

        decoratorActivityA.doThisWork();

        System.out.println("我是分界线.......");
        decoratorActivityB.doThisWork();
    }

}
