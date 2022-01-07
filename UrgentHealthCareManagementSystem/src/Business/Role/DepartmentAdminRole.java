/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class DepartmentAdminRole extends Role{

    public String toString(){
        return "Department Admin";
    }
    
    @Override
    public JPanel createWorkArea(JPanel arg0, UserAccount arg1, Organization arg2, Enterprise arg3, EcoSystem arg4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
