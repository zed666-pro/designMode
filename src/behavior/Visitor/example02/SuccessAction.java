package behavior.visitor.example02;

/**
 * @description: 具体的Action
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class SuccessAction implements Action{
    @Override
    public void visitMan(Man man) {
        System.out.println("每一个成功的" + man.name + "后面都有一个女人");
    }

    @Override
    public void visitWoman(Woman woman) {
        System.out.println("每一个成功的" + woman.name + "后面都有一个不成功的男人");
    }
}
