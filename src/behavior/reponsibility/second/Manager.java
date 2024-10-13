package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:56
 * @ClassName: Manager
 * @Description: TODO
 * @Version 1.0
 */
public class Manager extends Handler{

    public Manager() {
        super(Handler.LEVEL_2);
    }

    @Override
    public void handle(LeaveRequest request) {
        System.out.println("经理批准了假期！！");
        System.out.println(request.getName() + "请假了" + request.getDays() + "请假的原因是："+ request.getContent());
    }
}
