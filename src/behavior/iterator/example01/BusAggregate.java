package behavior.iterator.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class BusAggregate extends Aggregate{

    List<Passager> passagers = new ArrayList<>();

    @Override
    Iterator createIterator() {
        return new BusIterator(this);
    }

    void addPassager(Passager passager){
        passagers.add(passager);
    }
}
