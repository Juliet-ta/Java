package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private final List<Person> people;

    public PersonList() {
        people = new ArrayList<Person>();
    }

    public PersonList(PersonList personList) {
        this.people = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++) {
            this.people.add(personList.people.get(i));
        }
    }

    public List<Person> getList() {
        return people;
    }

    public void AddPerson(Person p) {
        people.add(p);
    }

    public void RemovePerson(int index) {
        people.remove(index);
    }

    public PersonList FindPersonByName(String name) {

        PersonList found = new PersonList();
        for (Person person : people) {
            if (person.getName().equals(name))
                found.AddPerson(person);
        }
        return found;
    }
}
