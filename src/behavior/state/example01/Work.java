package behavior.state.example01;

/**
 * @description: 工作状态
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Work extends State {
    @Override
    void doAction(OneDay oneDay) {

        System.out.println("14-17点属于工作状态....");

        oneDay.setState(new Relax());

    }
}
