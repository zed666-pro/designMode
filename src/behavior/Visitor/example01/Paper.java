package behavior.visitor.example01;

/**
 * 具体的被访问的对象
 */
public class Paper implements Material {

    @Override
    public void accept(Company company) {
        company.visit(this);
    }
}
