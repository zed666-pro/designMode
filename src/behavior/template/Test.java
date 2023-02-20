package behavior.template;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 20:54
 */


public class Test {
    public static void main(String[] args) {
        AbstractClass baocai = new ConcreteClass_Baocai();
        baocai.cookProcess();
        AbstractClass qingcai = new ConcreteClass_qingcai();
        qingcai.cookProcess();
    }
}
