/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.PatientRole;
import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class PharmacyEnterprise extends Enterprise {

    private EnterpriseType type;
    
    public void setType(EnterpriseType type) {
        this.type = type;
    }
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmacy);
       // this.cityPatients = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }

   
    @Override
    public String toString(){
        return getName();
    }
   
}
