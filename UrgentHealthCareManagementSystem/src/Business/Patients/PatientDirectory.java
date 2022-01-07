/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import java.util.ArrayList;

/**
 *
 * @author kohli
 */
public class PatientDirectory {
    ArrayList<Patient> patients;

    public PatientDirectory(){
        patients = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return this.patients;
    }

    public Patient addPatient(String name) {
        Patient newCus = new Patient();
        newCus.setName(name);
        this.patients.add(newCus);
        
        return newCus;
    }
    
    public void deletePatient(Patient cus){
        this.patients.remove(cus);
    }
    
    public Patient getPatient(int id){
        
        for(Patient patient: this.getPatientList()){
        
            if(patient.isMatch(id)){
                return patient;
            }
            
        }
         return null;
    }
    
    
}
