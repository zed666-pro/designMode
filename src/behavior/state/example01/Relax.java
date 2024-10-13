package behavior.state.example01;

/**
 * @description: 休息状态
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Relax extends State{
    @Override
    void doAction(OneDay oneDay) {
        System.out.println("11-14点是休息时间.....,我处于休息状态");
        oneDay.setState(new Games());
    }
}
