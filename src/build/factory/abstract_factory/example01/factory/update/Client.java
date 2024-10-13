package build.factory.abstract_factory.example01.factory.update;

import build.factory.abstract_factory.example01.pojo.User;
import build.factory.abstract_factory.example01.product.IUser;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Client {
    public static void main(String[] args) {
        DataAccessWithReflect dataAccessWithReflect = new DataAccessWithReflect();
        IUser iUser = dataAccessWithReflect.getIUser();
        iUser.addUser(new User());
        iUser.getUser(1);
    }
}
