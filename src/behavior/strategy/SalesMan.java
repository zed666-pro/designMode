package behavior.strategy;

/**
 * @description: 具体的环境类
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 22:54
 */


public class SalesMan {
    //需要再成员变量中加入Strategy接口
    private Strategy strategy;


    //在构造方法的中传入具体的实现类
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //在调用show方法的时候，具体的实现类会调用具体的show方法
    public void salesManShow(){
        strategy.show();
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
