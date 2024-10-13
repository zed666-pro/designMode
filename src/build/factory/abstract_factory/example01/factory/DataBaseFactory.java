package build.factory.abstract_factory.example01.factory;

import build.factory.abstract_factory.example01.product.IDepartment;
import build.factory.abstract_factory.example01.product.IUser;

/**
 * @description: 抽象的工厂
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public interface DataBaseFactory {

    IUser getUserInfo();

    IDepartment getDepartment();
}
