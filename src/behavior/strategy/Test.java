package behavior.strategy;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 22:56
 */


public class Test {

    public static void main(String[] args) {


        //今天是中秋采取满一送一的策略
        Strategy strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        salesMan.salesManShow();


        //现在变成了元旦，所以改成了满200减40
        Strategy strategyB = new StrategyB();
        salesMan.setStrategy(strategyB);
        salesMan.salesManShow();

    }
}
