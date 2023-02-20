package structure.adapter.Class;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:49
 */


public class Computer {

    public void readCard(SDCard sdCard){
        System.out.println("电脑开始读取数据：");
        String result = sdCard.readSD();
        System.out.println(result);
    }
}
