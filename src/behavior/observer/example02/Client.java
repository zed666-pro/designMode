package behavior.observer.example02;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class Client {
    public static void main(String[] args) {
        Notifyer notifyer = new Notifyer();

        Zhangchunhui zhangchunhui = new Zhangchunhui("张春辉");
        Liujingjing liujingjing = new Liujingjing("刘晶晶");
        notifyer.addObserver(zhangchunhui);
        notifyer.addObserver(liujingjing);

        notifyer.notify("老张来了");
    }

}
