package behavior.visitor.example01;

/**
 * 具体被访问的元素
 */
public class Cuprum implements Material{

    @Override
    public void accept(Company company) {
        company.visit(this);
    }
}
