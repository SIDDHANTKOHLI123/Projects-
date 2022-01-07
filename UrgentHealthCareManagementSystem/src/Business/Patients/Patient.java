/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import Business.Person.Person;
import Business.community.Community;

/**
 *
 * @author kohli
 */
public class Patient extends Person {
    
    private int id;
    private static int count = 0;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    public Patient(){
        
        count += 1;
        this.id = count;
        
    }
    
    public int getId() {
        return id;
    }

    public boolean isMatch(int id){
        return this.getId() == id;
    }
    
    @Override
    public String toString(){
        return this.getId()+"";
    }
}
