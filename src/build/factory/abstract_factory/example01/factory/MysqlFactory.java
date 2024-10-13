package build.factory.abstract_factory.example01.factory;

import build.factory.abstract_factory.example01.product.*;

/**
 * @description: 具体的工厂类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class MysqlFactory implements DataBaseFactory{

    @Override
    public IUser getUserInfo() {
        return new MysqlImplUser();
    }

    @Override
    public IDepartment getDepartment() {
        return new MysqlImplDepartment();
    }
}
