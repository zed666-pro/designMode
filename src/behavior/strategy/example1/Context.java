package behavior.strategy.example1;

/**
 * @description: 策略的上下文环境
 * @author: shengaojie
 * @create: 2023-10-29
 **/

public class Context {

    private Refactor refactor;

//    public Context(Refactor refactor) {
//        this.refactor = refactor;
//    }

    public Context(String type){
        switch (type){
            case "invokeAll":
                refactor = new InvokeAll();
                break;
            case "invokeAny":
                refactor = new InvokeAny();
                break;
            case "CountDownLatch":
                refactor = new CountDownlatch();
                break;
            default:
                throw new RuntimeException("no such type to refactor");

        }


    }

    //调用具体策略类中update方法的入口
    public void doRefactor(){

        refactor.update();
    }
}
