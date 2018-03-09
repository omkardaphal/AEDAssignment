/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Swappy
 */
public class Vendor {

    static ArrayList vendor = new ArrayList();

    public static void setVenor(String nm) {
        vendor.add(nm);
    }

    public static ArrayList getVendor() {
        return vendor;
    }

    public static void removeItem(int i) {
        vendor.remove(i);
    }

}
