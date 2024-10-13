package structure.bridge.example02;

/**
 * @description: 抽象的手机类
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public abstract class Mobile {
    SoftWare softWare;

    public abstract void execute();

    public void setSoftWare(SoftWare softWare) {
        this.softWare = softWare;
    }
}
