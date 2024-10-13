package build.factory.simple_factory.example01;

import java.util.Scanner;

/**
 * @description: 客户端
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class Client {
    public static void main(String[] args) {
        System.out.println("请输入你想要获取的操作类型");
        Scanner scanner = new Scanner(System.in);
        String operationType = scanner.nextLine();
        //创建工厂
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getOperation(operationType);
        Integer result = operation.operate(10, 2);
        System.out.println("result is : " + result);

    }

}
