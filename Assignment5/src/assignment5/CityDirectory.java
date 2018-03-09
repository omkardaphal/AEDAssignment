/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;

/**
 *
 * @author MAC
 */
class CityDirectory {

    public CityDirectory(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    ArrayList<City> cityList;
}
