package behavior.visitor.example02;

/**
 * @description: 抽象的访问者
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public interface Action {
    void visitMan(Man man);

    void visitWoman(Woman woman);
}
