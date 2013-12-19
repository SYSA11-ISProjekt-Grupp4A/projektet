package se.zarac.lu.sysa.grupp4a.biler.models;

import java.util.List;

public class Person {
    protected String name;
    protected String personNumber;
    protected List<Phone> phoneNumbers;
    protected List<Address> addresses;
    
    public Person(String name, String personNumber) {
        this.name = name;
        this.personNumber = personNumber; } }
