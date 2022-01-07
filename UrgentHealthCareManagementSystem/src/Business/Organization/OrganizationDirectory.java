/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalStaff.getValue())){
            organization = new HospitalStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Territory.getValue())){
            organization = new TerritoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorDepartment.getValue())){
            organization = new DoctorDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DrugManufacturer.getValue())){
            organization = new DrugManufacturerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public Organization getOrganization(Type type){
        
        for(Organization organization: this.getOrganizationList()){
            if (type.getValue().equals(Type.Doctor.getValue())){
                return organization;
            }
//          else if (type.getValue().equals(Type.Admin.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.Labour.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.BioDegradable.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.Delivery.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.Garbage.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.Muncipal.getValue())){
//              return organization;
//          }
//          else if (type.getValue().equals(Type.Lab.getValue())){
//              return organization;
//          }else if (type.getValue().equals(Type.Marketplace.getValue())){
//              return organization;
//          }  
        }
        return null;
    }
    
    public ArrayList<Organization> getOrganizations(Type type){
        
        ArrayList<Organization> selectOrg = new ArrayList<Organization>();
        
        for(Organization organization: this.getOrganizationList()){
            if (organization.getType().toString().equals(type.toString())){
                selectOrg.add(organization);
            } 
        }
        return selectOrg;
    }
}