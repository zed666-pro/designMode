package build.factory.factory_method.example01;

import build.factory.factory_method.example01.factory.OperationAddFactory;
import build.factory.factory_method.example01.factory.OperationFactory;
import build.factory.factory_method.example01.product.Operation;

/**
 * @description: 客户端
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class Client {

    public static void main(String[] args) {
        OperationFactory addFactory = new OperationAddFactory();
        Operation operation = addFactory.getOperation();
        Integer result = operation.operate(1, 3);
        System.out.println(result);

    }

}
