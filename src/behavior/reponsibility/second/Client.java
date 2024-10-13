package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:45
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("xiaoming", 1, "感冒");
        LeaveRequest request1 = new LeaveRequest("zhagnsan ", 4, "回家");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneraManager generaManager = new GeneraManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generaManager);

        groupLeader.submit(request1);

    }
}
