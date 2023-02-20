package behavior.reponsibility;

/**
 * @description: 具体的实现类
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 16:41
 */


public class Manager extends Handler {

    public Manager() {
        super(0,Handler.NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" +
                leave.getNum() + "天" + leave.getContent());
        System.out.println("部门经理审批同意");
    }
}
