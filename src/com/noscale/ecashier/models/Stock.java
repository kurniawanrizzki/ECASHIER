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
public class Stock {
    
    private int id;
    private float quantityAt;
    private String suppliedAt;
    private Supplier suppliedBy;

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

    public String getSuppliedAt() {
        return suppliedAt;
    }

    public void setSuppliedAt(String suppliedAt) {
        this.suppliedAt = suppliedAt;
    }

    public Supplier getSuppliedBy() {
        return suppliedBy;
    }

    public void setSuppliedBy(Supplier suppliedBy) {
        this.suppliedBy = suppliedBy;
    }
    
}
