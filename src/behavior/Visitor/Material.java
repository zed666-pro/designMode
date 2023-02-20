package behavior.Visitor;

/**
 *被访问的对象接口
 */
public interface Material {

    void accept(Company company);
}
