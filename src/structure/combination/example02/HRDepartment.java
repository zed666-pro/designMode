package structure.combination.example02;

/**
 * @description: 叶子节点
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class HRDepartment extends Company{


    public HRDepartment(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display() {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
