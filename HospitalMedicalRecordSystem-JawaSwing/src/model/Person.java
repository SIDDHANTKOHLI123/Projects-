package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kohli
 */


public class Person {
    private String name;
    private int age;
    private long contactno;
    private House house;
    protected int personID;
    static int personCount=0;

    public Person(String name,int age,long contactno){
        this.name=name;
        this.age=age;
        this.contactno=contactno;
        this.personID=++personCount;
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
     public boolean matchByName(String name) {
        
        return this.getName().equals(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }
     public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public long getContactno() {
        return contactno;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    
    
}
