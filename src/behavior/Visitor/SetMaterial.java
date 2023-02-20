package behavior.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 包含一个集合，其中包含了所有需要被访问的对象
 */
public class SetMaterial {

    private List<Material> materialList = new ArrayList<Material>();

    public void add(Material material){
        materialList.add(material);

    }

    public void remove(Material material){
        materialList.remove(material);
    }

    /*
    * 接受一个Company参数，使用该具体的公司来访问
    * 所有的材料
    * */
    public void accept(Company company){

        for(Material material : materialList){
            material.accept(company);
        }
    }
}


