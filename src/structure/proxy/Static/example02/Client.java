package structure.proxy.Static.example02;

/**
 * @description: 客户端测试
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Client {
    public static void main(String[] args) {
        Girl mm = new Girl("mm");
        RealPursuit realPursuit = new RealPursuit("zhangsan",mm);
        Proxy proxy = new Proxy(realPursuit);
        proxy.giveFlowers();
        proxy.giveToys();
        proxy.giveDolls();

    }

}
