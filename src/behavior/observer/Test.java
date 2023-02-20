package behavior.observer;

/**
 * @description: 测试类
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 17:27
 */

public class Test {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //订阅公众号
        WeinxinUser dingcc = new WeinxinUser("dingcc");

        WeinxinUser shengaojie  = new WeinxinUser("shengaojie");
        subject.attach(dingcc);
        subject.attach(shengaojie);
        //公众号更新
        subject.notify("公众号文章第一期");
    }
}
