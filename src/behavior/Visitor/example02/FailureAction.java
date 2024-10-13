package behavior.visitor.example02;

/**
 * @description: 具体的Action
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class FailureAction implements Action{
    @Override
    public void visitWoman(Woman woman) {
        System.out.println(woman.name + "失败时谁也劝不了");
    }


    @Override
    public void visitMan(Man man) {
        System.out.println(man.name + "失败时，谁也不用劝");
    }
}
