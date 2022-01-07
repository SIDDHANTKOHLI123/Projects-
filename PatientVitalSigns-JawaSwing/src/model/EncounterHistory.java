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
public class EncounterHistory {
     private ArrayList<Encounter> encounterList;
     Patient patient;
     
     public EncounterHistory(){
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterList;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterList = encounterHistory;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void addEncounter(Encounter encounter){
        this.encounterList.add(encounter);
    }
}
