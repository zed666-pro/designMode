package behavior.state;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:29
 * @ClassName: LiftState
 * @Description: TODO
 * @Version 1.0
 */
public abstract class LiftState {

    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //定义所有状态中的公共方法
    abstract void open();

    abstract void close();

    abstract void stop();

    abstract void run();
}
