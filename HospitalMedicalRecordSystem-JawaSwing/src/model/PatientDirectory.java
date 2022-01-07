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

public class PatientDirectory {
     ArrayList<Patient> patientList;
    
   public PatientDirectory(){
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public void addPatientToDirectory(Patient patient){
        this.patientList.add(patient);
}
    public void DeleteDetails(Patient pt){
 patientList.remove(pt);       
 
}
     public void removePatientFromDirectory(Patient patient){
        this.patientList.remove(patient);
    }
     public Patient getPatientByID(int patientId){
        for(Patient patient: this.patientList){
            if(patient.getPersonID()==patientId){
                return patient;
            }
        }
        return null;
    }
    
}
