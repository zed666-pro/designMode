package behavior.visitor.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class ObjectStructure {
    List<Person> people = new ArrayList<>();

    public void addElement(Person person){
        people.add(person);
    }


    public void removeElement(Person person){
        people.remove(person);
    }

    public void display(Action action){
        for (Person person : people) {
            person.accept(action);
        }

    }
}
