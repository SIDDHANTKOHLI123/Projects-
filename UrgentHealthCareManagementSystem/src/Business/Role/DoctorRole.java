/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DoctorRole.DoctorDashboardJPanel;


/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

    public String toString(){
        return "Doctor";
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorDashboardJPanel(userProcessContainer, account, organization, enterprise,business);
    }
    
    
}
