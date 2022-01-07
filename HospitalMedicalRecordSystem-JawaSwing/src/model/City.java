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
public class City {
    String cityName;
    ArrayList<Community> communityList;
    public City(){
        communityList=new ArrayList<>();
    }
    public City(String cityName){
        this.cityName=cityName;
        communityList=new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void addCommunityToCity(Community community){
        this.communityList.add(community);
    }
    public Community getCommunityByName(String communityName){
        for(Community community: this.communityList){
            System.out.println(community.getName());
            System.out.println(communityName);
            if(community.getName().equals(communityName)){
                return community;
            }
        }
        return null;
    }
}
