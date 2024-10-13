package structure.proxy.Static.example01;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 14:55
 */


public class ProxyPoint implements SellTickets{

    //这里聚合了被代理的目标类，后面调用的实际上是station的方法
    private Station station = new Station();

    @Override
    public void sell() {
        //这里算是对于原先买票行为的一种扩展，但是并没有修改原先的代码
        System.out.println("卖票的中介先收取一定的费用");
        station.sell();
    }


}
