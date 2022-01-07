/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DrugManufacturerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class DrugManufacturerEnterprise extends Enterprise {

    public DrugManufacturerEnterprise(String name) {
        super(name,EnterpriseType.DrugManufacturer);
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugManufacturerRole());
        return roles;
    }
    
}
