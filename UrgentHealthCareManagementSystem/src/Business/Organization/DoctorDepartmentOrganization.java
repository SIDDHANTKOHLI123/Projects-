/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Doctor.DoctorDirectory;
import Business.Role.DepartmentAdminRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class DoctorDepartmentOrganization extends Organization {

    private DoctorDirectory doctorDirectory;
    
    public DoctorDepartmentOrganization() {
        super(Organization.Type.DoctorDepartment.getValue());
        doctorDirectory= new DoctorDirectory();
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DepartmentAdminRole());
        return roles;
    }
    
}
