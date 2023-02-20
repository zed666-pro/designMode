package structure.adapter.object;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:51
 */


public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        String content = "这是从SDCard中读取的内容";
        return content;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("在SD卡中写入的内容为：" + msg);
    }
}
