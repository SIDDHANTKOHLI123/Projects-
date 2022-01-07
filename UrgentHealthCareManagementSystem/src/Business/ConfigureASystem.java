package Business;

import Business.Doctor.Doctor;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LabEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Enterprise.PopulationEnterprise;
import Business.Enterprise.TransportEnterprise;
import Business.Network.Network;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.DoctorDepartmentOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.TerritoryOrganization;
import Business.Patients.Patient;
import Business.Person.Person;
import Business.Role.AmbulanceDriverRole;
import Business.Role.DoctorRole;
import Business.Role.LabAssistantRole;
import Business.Role.PatientRole;
import Business.Role.PharmacistRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.community.Community;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Network boston = system.createAndAddNetwork();
        boston.setName("Boston");
         
        HospitalEnterprise hospital = (HospitalEnterprise)boston.getEnterpriseDirectory().createAndAddEnterprise("Hospital Enterprise", Enterprise.EnterpriseType.Hospital);
        hospital.setType(Enterprise.EnterpriseType.Hospital);
        hospital.setName("Boston General");
        
        PharmacyEnterprise pharmacy = (PharmacyEnterprise)boston.getEnterpriseDirectory().createAndAddEnterprise("Pharmacy Enterprise", Enterprise.EnterpriseType.Pharmacy);
        pharmacy.setType(Enterprise.EnterpriseType.Pharmacy);
        pharmacy.setName("Walgreens");
        
        PharmacyOrganization walgreens = (PharmacyOrganization)pharmacy.getOrganizationDirectory().createOrganization(Organization.Type.Pharmacy);
        walgreens.setName("Walgreens");
        walgreens.setType(Organization.Type.Pharmacy);
        
        Employee pharEmp = walgreens.getEmployeeDirectory().createEmployee("niki");
        pharEmp.setAddress("Boston");
        PharmacistRole pharm = new PharmacistRole();
        pharm.setType(Role.RoleType.Pharmacist);
        walgreens.getUserAccountDirectory().createUserAccount("niki", "123", pharEmp, pharm);
        
        
        
   
        
        
        Employee receptionistEmp = hospital.getEmployeeDirectory().createEmployee("Aniruddha Tambe");
        receptionistEmp.setAddress("Boston");
        
        UserAccount recep = hospital.getUserAccountDirectory().createUserAccount("andy", "123", receptionistEmp, new ReceptionistRole());

        LabEnterprise lab = (LabEnterprise)boston.getEnterpriseDirectory().createAndAddEnterprise("Lab Enterprise", Enterprise.EnterpriseType.Lab);
        lab.setType(Enterprise.EnterpriseType.Lab);


        DoctorDepartmentOrganization radio = (DoctorDepartmentOrganization)hospital.getOrganizationDirectory().createOrganization(Organization.Type.DoctorDepartment);
        radio.setName("Radiology");
        DoctorDepartmentOrganization neuro = (DoctorDepartmentOrganization)hospital.getOrganizationDirectory().createOrganization(Organization.Type.DoctorDepartment);
        neuro.setName("Neurology");
        radio.setType(Organization.Type.DoctorDepartment);
        neuro.setType(Organization.Type.DoctorDepartment);

        LabOrganization pythology = (LabOrganization)lab.getOrganizationDirectory().createOrganization(Organization.Type.Lab);
        pythology.setName("Pythology");
        pythology.setType(Organization.Type.Lab);

         LabOrganization xray = (LabOrganization)lab.getOrganizationDirectory().createOrganization(Organization.Type.Lab);
         xray.setName("X-Ray");
         xray.setType(Organization.Type.Lab);

        TransportEnterprise transportEnterprise = (TransportEnterprise)boston.getEnterpriseDirectory().createAndAddEnterprise("Transport Enterprise", Enterprise.EnterpriseType.TransportService);
        transportEnterprise.setType(Enterprise.EnterpriseType.TransportService); 

        AmbulanceOrganization lifesaverambulance=(AmbulanceOrganization)transportEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Ambulance);
        lifesaverambulance.setName("LifeSaverAmbulance");

        AmbulanceOrganization lifemattersambulance=(AmbulanceOrganization)transportEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Ambulance);
        lifemattersambulance.setName("LifeMatterAmbulance");

        lifesaverambulance.setType(Organization.Type.Ambulance);
        lifemattersambulance.setType(Organization.Type.Ambulance);

       //Employee 
        Employee docEmp = radio.getEmployeeDirectory().createEmployee("Kinjal Thakkar");
        docEmp.setAddress("Boston");
        Employee sidEmp = neuro.getEmployeeDirectory().createEmployee("Siddhant Kohli");

        Employee sangEmp=pythology.getEmployeeDirectory().createEmployee("Sangram");
        Employee sudishEmp=xray.getEmployeeDirectory().createEmployee("Sudish");

        sangEmp.setAddress("Boston");
        sudishEmp.setAddress("Boston");


        Employee ambDriver=lifesaverambulance.getEmployeeDirectory().createEmployee("Raju");
        ambDriver.setAddress("Boston");

        Employee ambDriver2=lifemattersambulance.getEmployeeDirectory().createEmployee("Vinay");
        ambDriver2.setAddress("Boston");

        AmbulanceDriverRole role = new AmbulanceDriverRole();
        role.setType(Role.RoleType.AmbulanceDriver);
        lifemattersambulance.getUserAccountDirectory().createUserAccount("vinay", "123", ambDriver,role);
        lifesaverambulance.getUserAccountDirectory().createUserAccount("raju", "123", ambDriver2, role);
        //Adding as doctor
        Doctor kj = new Doctor();
        kj.setEmp(docEmp);
        radio.getDoctorDirectory().getDoctorlist().add(kj);

        Doctor sK = new Doctor();
        sK.setEmp(sidEmp);
        neuro.getDoctorDirectory().getDoctorlist().add(sK);

        //
        pythology.getUserAccountDirectory().createUserAccount("sangram","123", sangEmp, new LabAssistantRole());
        xray.getUserAccountDirectory().createUserAccount("sudish","123", sudishEmp, new LabAssistantRole());

        //Create user
        radio.getUserAccountDirectory().createUserAccount("kinjal", "123", docEmp, new DoctorRole());
        neuro.getUserAccountDirectory().createUserAccount("sid", "123", sidEmp, new DoctorRole());

        //Create patient
        Patient patient = hospital.getPatients().addPatient("Foram Bhatt");
        patient.setAddress("Boston");
        System.out.println(patient.getId());
        
        hospital.getUserAccountDirectory().createUserAccount("foram", "123", patient, new PatientRole());

        HospitalEnterprise globalhospital = (HospitalEnterprise)boston.getEnterpriseDirectory().createAndAddEnterprise("Hospital Enterprise", Enterprise.EnterpriseType.Hospital);
        globalhospital.setType(Enterprise.EnterpriseType.Hospital);
        globalhospital.setName("Global Hospital");

        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
