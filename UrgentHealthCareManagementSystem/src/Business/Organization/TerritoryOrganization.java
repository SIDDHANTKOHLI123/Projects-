/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.community.CommunityDirectory;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TerritoryOrganization extends Organization{
    
     CommunityDirectory communities;
    public TerritoryOrganization(){
        super(Type.Territory.getValue());
        this.communities = new CommunityDirectory();
    }
    

    public CommunityDirectory getCommunities() {
        return communities;
    }

    public void setCommunities(CommunityDirectory communities) {
        this.communities = communities;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        roles.add(new PatientRole()); 
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
     
}