package behavior.visitor.example01;

/**
 * 具体的访问者类
 */
public class ArtCompany implements Company {

    @Override
    public void visit(Paper element) {
        System.out.println("艺术公司利用纸生产出海报");
    }

    @Override
    public void visit(Cuprum element) {
        System.out.println("艺术公司里哟纸生产出铜像");
    }
}
