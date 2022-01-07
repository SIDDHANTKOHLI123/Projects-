/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patients.PatientDirectory;
import Business.Role.AmbulanceDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class TransportEnterprise extends Enterprise {

    private EnterpriseType type;

    public TransportEnterprise(String name){
        super(name,EnterpriseType.TransportService);
    }
    
    public void setType(EnterpriseType type) {
        this.type = type;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AmbulanceDriverRole());
        return roles;
    }
    
    public String toString(){
        return this.getName();
    }
    
}
