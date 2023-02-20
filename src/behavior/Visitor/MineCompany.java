package behavior.Visitor;

/**
  具体的访问者类
 */
public class MineCompany implements Company{

    @Override
    public void visit(Paper element) {
        System.out.println("造币公司利用纸生产出纸币");
    }

    @Override
    public void visit(Cuprum element) {
        System.out.println("造币公司利用铜生产出铜币");
    }
}
