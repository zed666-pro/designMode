package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:58
 * @ClassName: GeneraManager
 * @Description: TODO
 * @Version 1.0
 */
public class GeneraManager extends Handler {

    public GeneraManager() {
        super(Handler.LEVEL_3);
    }

    @Override
    public void handle(LeaveRequest request) {
        System.out.println("总经理批准了假期！！");
        System.out.println(request.getName() + "请假了" + request.getDays() + "请假的原因是："+ request.getContent());
    }
}
