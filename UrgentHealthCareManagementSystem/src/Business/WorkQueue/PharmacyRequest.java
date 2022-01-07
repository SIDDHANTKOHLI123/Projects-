/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author kohli
 */
public class PharmacyRequest extends WorkRequest {
    
    private String message;
    private DoctorRequest doctorRequest;
    private UserAccount doctor;

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }
    
    

    
     public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public DoctorRequest getDoctorRequest() {
        return doctorRequest;
    }

    public void setDoctorRequest(DoctorRequest doctorRequest) {
        this.doctorRequest = doctorRequest;
    }

}
