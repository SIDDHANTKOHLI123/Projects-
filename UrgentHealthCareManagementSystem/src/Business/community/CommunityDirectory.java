/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.community;

import java.util.ArrayList;

/**
 *
 * @author kohli
 */
public class CommunityDirectory {
    
    ArrayList<Community> communities;
    public CommunityDirectory(){
        this.communities = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public Community AddCommunity(String name){
        Community c = new Community(name);
        this.communities.add(c);
        return c;
    }
    
}
