package structure.proxy.Static.example02;

/**
 * @description: 代理类
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Proxy implements GiveGift{

    RealPursuit realPursuit;

    public Proxy(RealPursuit realPursuit) {
        this.realPursuit = realPursuit;
    }

    @Override
    public void giveFlowers() {
        System.out.println("代理类准备帮 " + realPursuit.getName() + "准备花");
        realPursuit.giveFlowers();
    }

    @Override
    public void giveToys() {
        System.out.println("代理类准备帮 " + realPursuit.getName() + "买玩具");
        realPursuit.giveToys();
    }

    @Override
    public void giveDolls() {
        System.out.println("代理类准备帮 " + realPursuit.getName() + "抓娃娃");
        realPursuit.giveDolls();
    }
}
