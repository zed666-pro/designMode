package structure.Proxy.Static;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 14:54
 */


public class Station implements SellTickets{
    @Override
    public void sell() {
        System.out.println("从车站中买到票");
    }
}
