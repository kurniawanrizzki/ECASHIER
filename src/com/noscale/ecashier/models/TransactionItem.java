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
public class TransactionItem  {
   
    private Item noteItem;
    private float quantityAt, total;

    public Item getNoteItem() {
        return noteItem;
    }

    public void setNoteItem(Item noteItem) {
        this.noteItem = noteItem;
    }

    public float getQuantityAt() {
        return quantityAt;
    }

    public void setQuantityAt(float quantityAt) {
        this.quantityAt = quantityAt;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}