/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patients.PatientDirectory;
import Business.Role.AdminRole;
import Business.Role.LabAssistantRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class LabEnterprise extends Enterprise{

    private EnterpriseType type;
     
     
     public void setType(EnterpriseType type) {
        this.type = type;
    }
    public LabEnterprise(String name){
        super(name,EnterpriseType.Lab);
       // this.cityPatients = new PatientDirectory();
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }

    
}
