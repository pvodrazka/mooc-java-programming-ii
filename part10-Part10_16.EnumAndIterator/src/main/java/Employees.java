import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> seznam;

    public Employees(){
        this.seznam=new ArrayList<>();
    }

    public void add(Person personToAdd) {
        seznam.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> seznam.add(person));
    }

    public void print(){
        Iterator<Person> iterator = seznam.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = seznam.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
            System.out.println(nextInLine);}
    }}

    public void fire(Education education) {
        Iterator<Person> iterator = seznam.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
    }
}}
