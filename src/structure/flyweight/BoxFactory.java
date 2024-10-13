package structure.flyweight;

import java.util.HashMap;

/**
 * @Author shengaojie
 * @Date 2023/7/27 10:19
 * @ClassName: BoxFactory
 * @Description: TODO
 * @Version 1.0
 */
public class BoxFactory {
    private static HashMap<String,AbstractBox> map = new HashMap<>();
    private static BoxFactory factory = new BoxFactory();
    public static BoxFactory getInstance(){
        return factory;
    }

    public AbstractBox getBox(String boxName){

        if(!map.containsKey(boxName)){
            System.out.println("map中不存在该box，插入box：" +boxName);
            AbstractBox box = null;
            if(boxName.equals("I")){
                box = new IBox();
            }else if(boxName.equals("O")){
                box = new OBox();
            }else if(boxName.equals("J")){
                box = new JBox();
            }
            map.put(boxName,box);

        }else{
            System.out.println("map中已经存在该box，获取该box：" + boxName);

        }
        return map.get(boxName);
    }
}
