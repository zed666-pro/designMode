package build.factory.abstract_factory.example01.product;

import build.factory.abstract_factory.example01.pojo.User;

/**
 * @description: 抽象的产品类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public interface IUser {

    void addUser(User user);

    void getUser(int i);
}
