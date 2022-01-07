package model;



import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kohli
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory(){
 
        personList=new ArrayList<>();
}
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public void addPersonToDirectory(Person person){
        this.personList.add(person);
    }
  
    public void removePersonFromDirectory(Person person){
        this.personList.remove(person);
    }
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    public Person getPersonById(int personId){
        for(Person person:this.personList){
            if(person.getPersonID()==personId){
                return person;
            }
        }
        return null;
    }
    
}
