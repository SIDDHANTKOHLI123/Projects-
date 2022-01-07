/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Patients.Patient;

/**
 *
 * @author raunak
 */
public class PatientTransferRequest extends WorkRequest{
    
    private String comment;
    private HospitalEnterprise toHospital;
    private String time;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public HospitalEnterprise getToHospital() {
        return toHospital;
    }

    public void setToHospital(HospitalEnterprise toHospital) {
        this.toHospital = toHospital;
    }

    @Override
    public String toString(){
        return comment;
    }
}
