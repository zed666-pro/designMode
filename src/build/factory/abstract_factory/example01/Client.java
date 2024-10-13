package build.factory.abstract_factory.example01;

import build.factory.abstract_factory.example01.factory.DataBaseFactory;
import build.factory.abstract_factory.example01.factory.OracleFactory;
import build.factory.abstract_factory.example01.pojo.Department;
import build.factory.abstract_factory.example01.pojo.User;
import build.factory.abstract_factory.example01.product.IDepartment;
import build.factory.abstract_factory.example01.product.IUser;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Client {
    static DataBaseFactory factory;
    public static void main(String[] args) {
        factory = new OracleFactory();
        IUser userInfo = factory.getUserInfo();
        userInfo.getUser(1);
        userInfo.addUser(new User());

        IDepartment department = factory.getDepartment();
        department.getDepartment(1);
        department.addDepartment(new Department());

    }
}
