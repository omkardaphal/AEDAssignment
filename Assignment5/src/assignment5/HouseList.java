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
class HouseList {
    
 private ArrayList<House> comHouses ;

    public HouseList() {
        comHouses=new ArrayList<House>();
    }
 
 

    public ArrayList<House> getComHouses() {
        return comHouses;
    }

    public void setComHouses(ArrayList<House> comHouses) {
        this.comHouses = comHouses;
    }
    


     public House addHouse(){
     House house= new House();
     comHouses.add(house);
     return house;
     }
    
    
}
