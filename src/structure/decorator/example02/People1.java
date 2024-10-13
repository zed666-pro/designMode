package structure.decorator.example02;

/**
 * @description: 被装饰的类
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class People1 implements Activity{
    @Override
    public void doThisWork() {
        //这个是这个人的核心工作
        System.out.println("去实验室.....");

    }
}
