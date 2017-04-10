/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.models;

/**
 *
 * @author rizkikurniawan
 */
public class Price {
    
    private int id;
    private float quantityAt, price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantityAt() {
        return quantityAt;
    }

    public void setQuantityAt(float quantityAt) {
        this.quantityAt = quantityAt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
