package behavior.Visitor;

/**
 * 具体的被访问的对象
 */
public class Paper implements Material {

    @Override
    public void accept(Company company) {
        company.visit(this);
    }
}
