/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.models;

import java.util.List;

/**
 *
 * @author rizkikurniawan
 */
public class Item {
    
    private int id;
    private float availableStock;
    private String name, unit, createdAt, updatedAt;
    private User createdBy, updatedBy;
    private List<Price> priceUnitList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(float availableStock) {
        this.availableStock = availableStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Price> getPriceUnitList() {
        return priceUnitList;
    }

    public void setPriceUnitList(List<Price> priceUnitList) {
        this.priceUnitList = priceUnitList;
    }
    
}
