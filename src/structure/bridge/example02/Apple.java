package structure.bridge.example02;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Apple extends Mobile{
    @Override
    public void execute() {
        System.out.println("启动apple手机");
        softWare.run();
    }
}
