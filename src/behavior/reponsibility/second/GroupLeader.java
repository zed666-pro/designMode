package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:52
 * @ClassName: GroupLeader
 * @Description: TODO
 * @Version 1.0
 */
public class GroupLeader extends Handler{
    //小组长最多可以批准1天假期
    public GroupLeader() {
        super(Handler.LEVEL_1);
    }

    @Override
    public void handle(LeaveRequest request) {
        System.out.println("小组长批准了假期！！");
        System.out.println(request.getName() + "请假了" + request.getDays() + "请假的原因是："+ request.getContent());
    }
}
