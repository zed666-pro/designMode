package behavior.state.example01;

/**
 * @description: 玩游戏的状态
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Games extends  State{
    @Override
    void doAction(OneDay oneDay) {
        System.out.println("去网吧玩LoL");
    }
}
