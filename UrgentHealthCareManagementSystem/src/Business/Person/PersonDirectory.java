/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author kohli
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public Person addNewPerson(){
        Person person = new Person();
        this.personList.add(person);
        return person;
    }
    
}
