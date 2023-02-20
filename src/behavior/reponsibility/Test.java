package behavior.reponsibility;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 16:44
 */


public class Test {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest request = new LeaveRequest("dingcc", 5, "身体不适");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //提交请假申请
        groupLeader.submit(request);
    }
}
