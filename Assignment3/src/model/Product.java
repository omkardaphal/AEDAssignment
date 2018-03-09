/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Swappy
 */
public class Product {

    String pName;
    double price;
    String catalog;
    String vendor;
    String modelNumber;
    String proDesc;
    String proFeatures;

    public void setpName(String a) {
        this.pName = a;
    }

    public void setPrice(double a) {
        this.price = a;
    }

    public void setCatalog(String a) {
        this.catalog = a;

    }

    public void setVendor(String a) {
        this.vendor = a;
    }

    public void setModelNo(String a) {
        this.modelNumber = a;
    }

    public void setproDesc(String a) {
        this.proDesc = a;
    }

    public void setproFeatures(String a) {
        this.proFeatures = a;
    }

    public String getpName() {
        return pName;
    }

    public String getPrice() {
        return "" + price;
    }

    public String getCatalog() {
        return catalog;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModelNo() {
        return modelNumber;
    }

    public String getProesc() {
        return proDesc;
    }

    public String getProFeatures() {
        return proFeatures;
    }
}
