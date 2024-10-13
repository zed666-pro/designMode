package build.factory.abstract_factory.example01.product;

import build.factory.abstract_factory.example01.pojo.User;

/**
 * @description: 具体的实现类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class OracleImpIUser implements IUser {
    @Override
    public void addUser(User user) {
        System.out.println("使用Oracle增加一个User记录");
    }

    @Override
    public void getUser(int i) {
        System.out.println("使用Oracle获取一个User记录");
    }
}
