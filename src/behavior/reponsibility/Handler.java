package behavior.reponsibility;

/**
 * @description: 抽象的处理者
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 16:30
 */


public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请求天数区间
    private int numStart;
    private int numEnd;

    //申明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }


    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假的方法
    protected abstract void handlerLeave(LeaveRequest leave);

    //提交请假条
    public final void submit(LeaveRequest leave){
        if(this.nextHandler != null && leave.getNum() > this.numEnd){
            //交给上级领导审批
            this.nextHandler.submit(leave);
        }else{
            //该领导进行审批
            this.handlerLeave(leave);
            System.out.println("流程结束了");
        }
    }
}
