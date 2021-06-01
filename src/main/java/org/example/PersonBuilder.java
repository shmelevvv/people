package org.example;

public class PersonBuilder {
    private Person person;
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Unavailable value for age");
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) throw new IllegalStateException("Not set name or surname");
        person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}
