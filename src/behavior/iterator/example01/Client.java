package behavior.iterator.example01;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Client {
    public static void main(String[] args) {
        BusAggregate busAggregate = new BusAggregate();

        for (int i = 0; i < 10; i++) {
            Passager passager = new Passager("passager" + i);
            busAggregate.addPassager(passager);
        }

        Iterator iterator = busAggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.nextItem();
        }
    }

}
