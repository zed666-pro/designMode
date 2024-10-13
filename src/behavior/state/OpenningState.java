package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:30
 * @ClassName: OpenningState
 * @Description: TODO
 * @Version 1.0
 */
public class OpenningState extends LiftState{

    @Override
    void open() {
        //do nothing
    }

    @Override
    void close() {
        context.setLiftState(Context.closingState);
        System.out.println("电梯从open ---> close");
    }

    @Override
    void stop() {
        System.out.println("电梯门没有关闭，不能停止");
    }

    @Override
    void run() {
        System.out.println("电梯门没有关闭，不能运行");
    }
}
