package build.factory.abstract_factory.example01.product;

import build.factory.abstract_factory.example01.pojo.User;

/**
 * @description: 具体的产品
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class MysqlImplUser implements IUser{
    @Override
    public void addUser(User user) {
        System.out.println("使用Mysql增加一个User对象");
    }

    @Override
    public void getUser(int i) {
        System.out.println("使用Mysql获取一个User对象");
    }
}
