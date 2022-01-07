/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AmbulanceDriver.AmbulanceDashboardJPanel;

/**
 *
 * @author kinjal
 */
public class AmbulanceDriverRole extends Role {

    private RoleType type;

    public RoleType getType() {
        return type;
    }

    public void setType(RoleType type) {
        this.type = type;
    }
    
    public String toString(){
        return "AmbulanceDriver";
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceDashboardJPanel(userProcessContainer, account, (AmbulanceOrganization)organization, enterprise,business);
    }
    
}
