package build.factory.abstract_factory.example01.factory.update;

import build.factory.abstract_factory.example01.product.*;

/**
 * @author: shengaojie
 * @create: 2023-12-12
 * @description: 使用该类来代替抽象工厂了和具体的工厂类
 *               使用简单工厂模式和简化
 *
 **/

public class DataAccess {
    private static String sqlName = "Mysql";
    IUser getUserInfo(){
        IUser iUser = null;
        switch (sqlName){
            case "Mysql":
                iUser = new MysqlImplUser();
                break;
            case "Oracle":
                iUser = new OracleImpIUser();
                break;
            default:
                throw new RuntimeException("不支持的数据库类型");
        }
        return iUser;

    }

    IDepartment getDepartment(){
        IDepartment iDepartment = null;
        switch (sqlName){
            case "Mysql":
                iDepartment = new MysqlImplDepartment();
                break;
            case "Oracle":
                iDepartment = new OracleImplDepartment();
                break;
            default:
                throw new RuntimeException("不支持的数据库类型");
        }
        return iDepartment;


    }

}
