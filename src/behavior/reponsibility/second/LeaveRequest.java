package behavior.reponsibility.second;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:46
 * @ClassName: LeaveRequest
 * @Description: 请假条类
 * @Version 1.0
 */
public class LeaveRequest {
    String name;
    int days;
    String content;


    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
