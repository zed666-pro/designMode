package behavior.strategy;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 22:53
 */


public class StrategyB implements Strategy{

    @Override
    public void show() {
        System.out.println("满200减40");
    }
}
