/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class Department {
    // Member Variables
    private String departmentId;
    private String departmentName;
    private String username;
    private String password;
  //  private Hospital hospital;
    private String departmentAdminName;
    private ArrayList<Doctor> doctorDirectory;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Hospital getHospital() {
//        return hospital;
//    }
//
//    public void setHospital(Hospital hospital) {
//        this.hospital = hospital;
//    }

    public String getDepartmentAdminName() {
        return departmentAdminName;
    }

    public void setDepartmentAdminName(String departmentAdminName) {
        this.departmentAdminName = departmentAdminName;
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentName=" + departmentName + '}';
    }
 
}
