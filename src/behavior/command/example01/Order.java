package behavior.command.example01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shengaojie
 * @Date 2023/7/28 09:48
 * @ClassName: Order
 * @Description: TODO
 * @Version 1.0
 */
public class Order {
    private int dinnerTable;
    private Map<String,Integer> foodDic = new HashMap<>();

    public Order(int dinnerTable, Map<String, Integer> foodDic) {
        this.dinnerTable = dinnerTable;
        this.foodDic = foodDic;
    }

    public int getDinnerTable() {
        return dinnerTable;
    }

    public void setDinnerTable(int dinnerTable) {
        this.dinnerTable = dinnerTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(Map<String, Integer> foodDic) {
        this.foodDic = foodDic;
    }
}
