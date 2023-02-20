package behavior.reponsibility;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 16:43
 */


public class GeneralManager extends Handler {

    public GeneralManager() {
        super(0,Handler.NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" +
                leave.getNum() + "天" + leave.getContent());
        System.out.println("总经理审批同意");
    }
}
