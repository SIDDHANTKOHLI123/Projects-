/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Department.Department;
import Business.Employee.Employee;
import Business.Person.Person;

/**
 *
 * @author kohli
 */
public class Doctor {
    
    private int doctorId;
    private Employee emp;
    private static int count = 0;
    private Department department;
     
    public Doctor() {
        count++;
        doctorId = count;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Doctor.count = count;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public String getName(){
        return this.getEmp().getName();
    } 
    
    public void setName(String name){
        this.getEmp().setName(name);
    } 

    @Override
    public String toString() {
        return emp.getName();
    }
    
}
