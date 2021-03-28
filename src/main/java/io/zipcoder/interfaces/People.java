package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public class People<PersonType> implements Iterable<PersonType> {

    private List<PersonType> personList;

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public PersonType findById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                return personList.get(i);
            }
        }
        return null;
    }

    public boolean contains(PersonType person) {
        return personList.contains(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
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

    // Not sure how to do this....
    public PersonType[] toArray() {
        //Object[] personArray = new Object[personList.size()];
        //return (PersonType[]) personList.toArray(personArray);
        return null;
    }

    public Iterator<PersonType> iterator(){
        return personList.iterator();
    }

}
