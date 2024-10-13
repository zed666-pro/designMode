package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:53
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.openningState);

        context.close();
        context.run();
        context.stop();
    }
}
