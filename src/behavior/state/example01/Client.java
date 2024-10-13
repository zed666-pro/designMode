package behavior.state.example01;

/**
 * @description: 客户端调用
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Client {
    public static void main(String[] args) {
        OneDay oneDay = new OneDay();
        oneDay.setState(new Work());
        oneDay.doJob();
        oneDay.doJob();
        oneDay.doJob();
    }

}
