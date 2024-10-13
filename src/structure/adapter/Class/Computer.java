package structure.adapter.Class;


/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:49
 */
public class Computer {

    /*
     * @Author shengaojie
     * @Description //TODO
     * @Date 10:24 2023/3/3
     * @Param
     * @return
     **/
    public void readCard(SDCard sdCard){
        System.out.println("电脑开始读取数据：");
        String result = sdCard.readSD();
        System.out.println(result);
    }
}
