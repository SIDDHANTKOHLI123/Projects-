/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kohli
 */
public class House {
    ArrayList<Person> persons;
    private Community community;
    private String Rowno;
    private String Streetno;
    private long zipcode;
    
    public House(){
    persons=new ArrayList();
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getRowno() {
        return Rowno;
    }

    public void setRowno(String Rowno) {
        this.Rowno = Rowno;
    }

    public String getStreetno() {
        return Streetno;
    }

    public void setStreetno(String Streetno) {
        this.Streetno = Streetno;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
    
    
    public void addPerson(Person person){
        this.persons.add(person);
    }
    
}
