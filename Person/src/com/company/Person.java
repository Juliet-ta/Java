package com.company;


public class Person {
    protected final String name;
    protected Address address;
    protected int id;

    public Person(int Id) {
        this.name = "Andrey";
        address = new Address();
        id = Id;
    }

    public Person(String name, int Id) {
        this.name = name;
        id = Id;
        address = new Address();
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person {" +
                "id = " + id +
                ", name = " + name +
                ", address = " + address;
    }
}
