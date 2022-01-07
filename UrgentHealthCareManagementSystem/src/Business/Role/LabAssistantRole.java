/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import ui.Lab.LabDashboardJPanel;

/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {

    public String toString(){
        return "Lab Assistant";
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem business) {
        return new LabDashboardJPanel(userProcessContainer, account, organization, enterprise);
    }
    
}
