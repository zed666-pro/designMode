package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:38
 * @ClassName: RunningState
 * @Description: TODO
 * @Version 1.0
 */
public class RunningState extends LiftState{
    @Override
    void open() {
        System.out.println("电梯处于运行状态无法开门");
    }

    @Override
    void close() {
        context.setLiftState(Context.closingState);
        System.out.println("电梯从 run———> close ");
    }

    @Override
    void stop() {
        context.setLiftState(Context.stoppingState);
        System.out.println("电梯从 run ———> stop");
    }

    @Override
    void run() {
        System.out.println("电梯已经处于run...");
    }
}
