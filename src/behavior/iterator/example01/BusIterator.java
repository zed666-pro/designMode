package behavior.iterator.example01;

import java.util.List;

/**
 * @description: bus的迭代器
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class BusIterator implements Iterator<Passager>{
    private int currentNum = 0;
    private BusAggregate aggregate;

    private List<Passager> list;

    public BusIterator(BusAggregate aggregate) {
        this.aggregate = aggregate;
        this.list = aggregate.passagers;
    }


    @Override
    public Passager currentItem() {
        return list.get(currentNum);
    }

    @Override
    public Passager nextItem() {
        Passager passager = null;
        currentNum++;
        if(currentNum < list.size()){
            passager = list.get(currentNum);

        }
        return passager;
    }

    @Override
    public boolean hasNext() {
        return currentNum < list.size();
    }

    @Override
    public Passager firstItem() {
        return list.get(0);
    }
}
