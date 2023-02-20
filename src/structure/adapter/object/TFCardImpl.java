package structure.adapter.object;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:52
 */


public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String content = "这是从TFCard中读取的内容";
        return content;
    }

    @Override
    public void writeTF(String msg) {

        System.out.println("在TF中写下的内容是：" + msg);

    }
}
