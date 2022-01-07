/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Patients.PatientDirectory;
import Business.Role.AdminRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class HospitalEnterprise extends Enterprise {
    
    private EnterpriseType type;
    private PatientDirectory cityPatients;


    public void setType(EnterpriseType type) {
        this.type = type;
    }
    
     public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
        this.cityPatients = new PatientDirectory();
    }

    public PatientDirectory getCityPatients() {
        return cityPatients;
    }

    public void setCityPatients(PatientDirectory cityPatients) {
        this.cityPatients = cityPatients;
    }
     
     public Organization getOrganizationByName(String name){
         
         for(Organization org:this.getOrganizationDirectory().getOrganizationList()){
             if(org.getName().equals(name)){
                 return org;
             }
         }
         return null;
     
     }

    public PatientDirectory getPatients() {
        return cityPatients;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        roles.add(new AdminRole());
        return roles;
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
}
