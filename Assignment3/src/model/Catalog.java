/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Swappy
 */
public class Catalog {

    HashMap<Integer, String> hashMap;

    public Catalog() {
        hashMap = new HashMap<>();
        hashMap.put(1, "Computer catalog");
        hashMap.put(2, "Printer catalog");
        hashMap.put(3, "Hardware parts catalog");
        hashMap.put(4, "Software products catalog");
    }

    public HashMap getCatalog() {
        return hashMap;
    }

}
