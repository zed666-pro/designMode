package structure.decorator.example02;

/**
 * @description: 被装饰的类
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class People2 implements Activity{
    @Override
    public void doThisWork() {
        System.out.println("去实验室.....");
    }
}
