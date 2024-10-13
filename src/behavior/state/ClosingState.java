package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:38
 * @ClassName: ClosingState
 * @Description: TODO
 * @Version 1.0
 */
public class ClosingState extends LiftState{

    @Override
    void open() {
        context.setLiftState(Context.openningState);
        System.out.println("电梯从close———>open");
    }

    @Override
    void close() {
        //
        System.out.println("电梯本身就处于close状态");
    }

    @Override
    void stop() {
        System.out.println("电梯本身就处于close状态");
    }

    @Override
    void run() {
        System.out.println("电梯无法从close ———> run");
    }
}
