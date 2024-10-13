package behavior.strategy.example1;

/**
 * @description: 客户端
 * @author: shengaojie
 * @create: 2023-10-29
 **/

public class Client {
    public static void main(String[] args) {
//        Context context = new Context(new InvokeAll());
//        context.doRefactor();
//
//        Context context1 = new Context(new CountDownlatch());
//        context1.doRefactor();

        /**
         * 上述的需要再构造方法中传入具体的策略，并且再客户端中使用大量的switch去判断，
         * 采用哪种参数但是其实可以将策略的选择延迟到context的构造方法中去。
         */
        Context context = new Context("invokeAll");
        context.doRefactor();


    }

}
