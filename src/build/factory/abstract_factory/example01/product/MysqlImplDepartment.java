package build.factory.abstract_factory.example01.product;

import build.factory.abstract_factory.example01.pojo.Department;

/**
 * @description: 具体的实现类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class MysqlImplDepartment implements IDepartment{

    @Override
    public void addDepartment(Department department) {
        System.out.println("使用Mysql插入一条Department记录");
    }

    @Override
    public void getDepartment(int i) {
        System.out.println("使用Mysql获取一条Department记录");
    }
}
