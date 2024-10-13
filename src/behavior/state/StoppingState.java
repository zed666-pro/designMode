package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:39
 * @ClassName: StoppingState
 * @Description: TODO
 * @Version 1.0
 */
public class StoppingState extends LiftState{
    @Override
    void open() {
        context.setLiftState(Context.openningState);
        System.out.println("电梯从stop ———> open");
    }

    @Override
    void close() {
        System.out.println("电梯已经处于stop状态，无需关闭门");
    }

    @Override
    void stop() {
        System.out.println("电梯已经处于stop状态");
    }

    @Override
    void run() {
        System.out.println("关闭的电梯需要先open才能运行");
    }
}
