package behavior.reponsibility;

/**
 * @description: 具体的处理者
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 16:38
 */


public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" +
                    leave.getNum() + "天" + leave.getContent());
        System.out.println("小组长审批同意");
    }
}
