package build.factory.abstract_factory.example01.factory;

import build.factory.abstract_factory.example01.product.IDepartment;
import build.factory.abstract_factory.example01.product.IUser;
import build.factory.abstract_factory.example01.product.OracleImpIUser;
import build.factory.abstract_factory.example01.product.OracleImplDepartment;

/**
 * @description: 具体的工厂类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class OracleFactory implements DataBaseFactory{

    @Override
    public IUser getUserInfo() {
        return new OracleImpIUser();
    }

    @Override
    public IDepartment getDepartment() {
        return new OracleImplDepartment();
    }
}
