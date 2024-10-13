package build.factory.factory_method.example01.factory;

import build.factory.factory_method.example01.product.Operation;
import build.factory.factory_method.example01.product.OperationSub;

/**
 * @description: 工厂接口
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public interface OperationFactory {

    Operation getOperation();
}
