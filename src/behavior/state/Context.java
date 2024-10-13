package behavior.state;

import java.io.Closeable;

/**
 * @Author shengaojie
 * @Date 2023/8/1 09:28
 * @ClassName: Context
 * @Description: 上下文环境，里面各种状态
 * @Version 1.0
 */
public class Context {
    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();

    public static final RunningState runningState = new RunningState();

    public static final StoppingState stoppingState = new StoppingState();

    //表示当前的状态
    public LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //需要给state中的context初始化
        liftState.setContext(this);
    }

    //下面的几个方法实际上是调用对应的LiftState中的对应方法
    public void open(){
        this.liftState.open();
    }


    public void close(){
        this.liftState.close();
    }


    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}

