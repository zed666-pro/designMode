package structure.proxy.Static.example02;

/**
 * @description: 真正的追求者
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class RealPursuit implements GiveGift{

    private String name;

    private Girl girl;


    public RealPursuit(String name, Girl girl) {
        this.name = name;
        this.girl = girl;
    }

    @Override
    public void giveFlowers() {
        System.out.println(name + " 送花给 --> " + girl.getName());
    }

    @Override
    public void giveToys() {
        System.out.println(name + " 送玩具给 --> " + girl.getName());
    }

    @Override
    public void giveDolls() {
        System.out.println(name + " 送布娃娃给 --> " + girl.getName());
    }

    public String getName() {
        return name;
    }
}
