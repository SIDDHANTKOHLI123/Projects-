/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;
import Business.Employee.*;

/**
 *
 * @author kinjal
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorlist;

    public DoctorDirectory() {
        doctorlist = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorlist() {
        return this.doctorlist;
    }

    public void setDoctorlist(ArrayList<Doctor> doctorlist) {
        this.doctorlist = doctorlist;
    }

    public Doctor addDoctor(){
        Doctor doctor = new Doctor();
        doctorlist.add(doctor);
        return doctor;
    }
   
    public void deleteDoctor(Doctor doctor){
        doctorlist.remove(doctor); 
    }
    
    public void updateDoctor(Doctor doctor){
        System.out.println("doc list"+ doctorlist);
        for(Doctor doc : doctorlist){
            if(doc.getDoctorId() == doctor.getDoctorId()){
               doc = doctor;
                
            }
        }
    }
 
    public Doctor searchDoctor(String doctorName){
        for (Doctor doctor: doctorlist) {
            if (doctor.getName().equals(doctorName)) {
                return doctor;
            }
        }
        return null;
    }
    
    public Doctor searchDoctorByEmployee(Employee emp){
        for (Doctor doctor: doctorlist) {
            if (doctor.getEmp().equals(emp)) {
                return doctor;
            }
        }
        return null;
    }
    
}
