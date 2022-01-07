/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kohli
 */
public class UserDirectory {
    ArrayList<User> userdir;
    
    public UserDirectory(){
        userdir = new ArrayList<User>();
        addUserLogins();
        
        
    }
     public User getUserByUsername(String userName){
        
        for(User us:this.getUserdir()){
            if(us.getUsername().equals(userName)){
                return us;
            }
        }
        return null;
    }

   

    public User addUser() {
        User userinput = new User();
        userdir.add(userinput);
        return userinput;
    }
     public void addUserLogins() {
        User user=addUser();
        user.setUsername("Siddhant");
        user.setPassword("Kohli");
        
    }

    public ArrayList<User> getUserdir() {
        return userdir;
    }
    
    
}
