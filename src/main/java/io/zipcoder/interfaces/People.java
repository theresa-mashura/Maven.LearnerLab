package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    public List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<PersonType>();
    }

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public PersonType findById(long id) {
        Iterator<PersonType> itr = iterator();
        while(itr.hasNext()) {
            PersonType p = itr.next();
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(PersonType person) {
        return this.personList.contains(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }

    public void remove(long id) {
        PersonType personToRemove = findById(id);
        remove(personToRemove);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public abstract PersonType[] toArray();

    public Iterator<PersonType> iterator(){
        return personList.iterator();
    }

}
