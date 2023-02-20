package structure.adapter.Class;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 15:55
 */


public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        computer.readCard(sdCard);

        System.out.println("======================");

        TFCardImpl tfCard = new TFCardImpl();
        SDToTFAdapter adapter = new SDToTFAdapter(tfCard);
        computer.readCard(adapter);

    }
}
