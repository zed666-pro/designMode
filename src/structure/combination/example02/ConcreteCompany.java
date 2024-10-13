package structure.combination.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 树枝节点
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class ConcreteCompany extends Company{
    List<Company> companyList = new ArrayList<>();

    public ConcreteCompany(String name, int depth) {
        super(name, depth);
    }


    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display() {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (Company company : companyList) {
            company.display();
        }
    }
}
