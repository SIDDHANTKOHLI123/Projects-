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
public class Patient extends Person {
    
    
    EncounterHistory encounterHistory;
    
    public Patient(String name,int age,long contactno){
        super(name, age, contactno);
      
        
        encounterHistory=new EncounterHistory();
    }

   public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

   
     
    
    
  
}
