/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

/**
 *
 * @author romydekoning
 */
public class Memory extends Part {
    
    private String subtype;
    private int size;

    public Memory(String title, double price, String subtype, int size) {
        super(title, price);
        this.subtype = subtype;
        this.size = size;
    }
    
}
