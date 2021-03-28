package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        Iterator<Person> itr = iterator();
        while(itr.hasNext()) {
            Person p = itr.next();
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return this.personList.contains(person);
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(long id) {
        Person personToRemove = findById(id);
        remove(personToRemove);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    // Not sure how to do this....
    public Person[] toArray() {
        Person[] personArray = new Person[personList.size()];
        return personList.toArray(personArray);
        //return null;
    }

    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}
