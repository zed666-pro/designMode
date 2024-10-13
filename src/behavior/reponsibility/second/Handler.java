package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:47
 * @ClassName: Handler
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Handler {
    //不同领导能处理的请假天数
    protected static final int LEVEL_1 = 1;
    protected static final int LEVEL_2 = 3;
    protected static final int LEVEL_3 = 7;
    //下一个处理者
    Handler nextHandler;
    private int days;

    public Handler(int days) {
        this.days = days;
    }
    //使用set方法设置处理者链
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void submit(LeaveRequest request){
        //如果权限不够，交个下一个处理者处理
        if(this.nextHandler != null && request.getDays() > this.days){
            this.nextHandler.submit(request);
        }else{
            //本处理者可以处理
            handle(request);
            System.out.println("请假流程完成");
        }
    }

    public abstract void handle(LeaveRequest request);
}
