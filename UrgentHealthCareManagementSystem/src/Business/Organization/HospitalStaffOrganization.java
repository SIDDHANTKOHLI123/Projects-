/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class HospitalStaffOrganization extends Organization{

    public HospitalStaffOrganization() {
        super(Organization.Type.HospitalStaff.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }
    
}
