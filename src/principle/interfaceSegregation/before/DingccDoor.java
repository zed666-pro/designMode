package principle.interfaceSegregation.before;

import java.lang.reflect.Proxy;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:52
 */


public class DingccDoor implements SaftyDoor{
    @Override
    public void proofFire() {


    }

    @Override
    public void proofWater() {

    }

    @Override
    public void proofSound() {

    }

    //问题：如果我想在创建一个Door类，但是这个Door类只需防噪音和防火怎么实现？

}
