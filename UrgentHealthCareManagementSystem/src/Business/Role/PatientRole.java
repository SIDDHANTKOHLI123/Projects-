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
import ui.DoctorRole.DoctorAppointmentsJPanel;
import ui.DoctorRole.DoctorDashboardJPanel;
import ui.Patient.PatientDashboardJPanel;

/**
 *
 * @author raunak
 */
public class PatientRole extends Role{

    public String toString(){
        return "Patient";
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientDashboardJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise,business);
    }
    
    
}
