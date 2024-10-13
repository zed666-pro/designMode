package build.factory.abstract_factory.example01.factory.update;

import build.factory.abstract_factory.example01.product.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @description: 使用反射简化简单工厂模式
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class DataAccessWithReflect {

    IUser getUserInfo(){

        return getIUser();

    }

    public IUser getIUser() {
        IUser iUser = null;
        String filePath = this.getClass().getResource("").getPath();
        System.out.println(filePath);
        try{
            Properties properties = new Properties();
            properties.load(new FileReader(filePath + "sqlInfo.properties"));
            String sqlName = properties.getProperty("sqlName");
            System.out.println("sqlName = " + sqlName);

            Class<?> cls = Class.forName(sqlName);
            Constructor<?> constructor = cls.getConstructor();
            iUser = (IUser)constructor.newInstance();


        }catch (Exception e){
            e.printStackTrace();
        }

        return iUser;


    }

}
