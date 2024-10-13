package behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:01
 * @ClassName: Context
 * @Description: 环境角色
 * @Version 1.0
 */
public class Context {
    //存储各个Variable的值
    private Map<Variable,Integer> map = new HashMap<>();
    //添加Variable
    public void assgin(Variable var,Integer value){
        map.put(var,value);
    }
    //获取Variable对应的值
    public int getValue(Variable var){
        Integer value = map.get(var);
        return value;
    }
}
