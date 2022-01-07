/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Patient.PatientDashboardJPanel;
import ui.Receptionist.ReceptionDashboard;
import ui.Receptionist.RequestAmbulanceJPanel;

/**
 *
 * @author kinjal
 */
public class ReceptionistRole extends Role {

    public String toString(){
        return "Receptionist";
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionDashboard(userProcessContainer, account, (AmbulanceOrganization)organization, enterprise,business);
    }
    
}
