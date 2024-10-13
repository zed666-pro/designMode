package structure.bridge.example02;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Huawei extends Mobile{

    @Override
    public void execute() {
        System.out.println("启动华为手机");
        softWare.run();
    }
}
