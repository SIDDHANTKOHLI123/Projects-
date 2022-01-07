/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author kohli
 */
public class LabRequest extends WorkRequest {
    
    private String message;
    private DoctorRequest doctorRequest;
     private ImageIcon image;
     private String fileDir;

    public String getFileDir() {
        return fileDir;
    }

    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
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
     public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
}
