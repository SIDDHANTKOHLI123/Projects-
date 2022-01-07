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
public class PopulationEnterprise extends Enterprise {
    
   private PatientDirectory cityPatients;
    
//     public PopulationEnterprise(String name){
//        super(name,EnterpriseType.Population);
//        this.cityPatients = new PatientDirectory();
//    }

    public PopulationEnterprise(String name, EnterpriseType type) {
        super(name, type);
    }
    
     public Organization getOrganizationByName(String name){
         
         for(Organization org:this.getOrganizationDirectory().getOrganizationList()){
             if(org.getName().equals(name)){
                 return org;
             }
         }
         return null;
     
     }

    public PatientDirectory getCityCustomers() {
        return cityPatients;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        roles.add(new AdminRole());
        return roles;
    }
    
}
