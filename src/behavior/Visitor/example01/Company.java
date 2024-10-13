package behavior.visitor.example01;

/**
 * 抽象访问者，是一个接口
 */
public interface Company {

    void visit(Paper element);

    void visit(Cuprum element);



}
