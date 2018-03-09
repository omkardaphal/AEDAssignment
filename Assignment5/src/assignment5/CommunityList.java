/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CommunityList {
    
     private   ArrayList<Community> communityList;

    public CommunityList() {
        communityList= new ArrayList<>();
        
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
         public Community addCommunity() {
        Community community = new Community();
        communityList.add(community);
        return community;
    }
     
    
}
