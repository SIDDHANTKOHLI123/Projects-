/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kohli
 */
public class UberDetailsHistory {
    
    private ArrayList<UberDetails> history;
    //private Date lastupdatedDate;

    //Public Date getLastupdatedDate() {
       // return lastupdatedDate;
    //}

    //Public void setLastupdatedDate(Date lastupdatedDate) {
       // this.lastupdatedDate = lastupdatedDate;
    //}
    
    public UberDetailsHistory(){  
        this.history=new ArrayList<UberDetails>(); 
    }

    public ArrayList<UberDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<UberDetails> history) {
        this.history = history;
    }
    
    public UberDetails addNewCars(){
        UberDetails newCars=new UberDetails();
        history.add(newCars);
        return newCars;
    }
    
    public void addNewCars(UberDetails uberDetails){
        history.add(uberDetails);
        
    }
    public void deleteDetails(UberDetails ud){
        history.remove(ud);
    }
    
}
