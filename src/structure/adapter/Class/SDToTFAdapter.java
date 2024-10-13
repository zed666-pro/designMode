package structure.adapter.Class;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:53
 */


public class SDToTFAdapter extends TFCardImpl implements SDCard {

    //这种是对象适配器的写法
    private TFCardImpl tfCard;

    public SDToTFAdapter(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("使用适配器完成读取转换");
        return readTF();
    }

    
    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
