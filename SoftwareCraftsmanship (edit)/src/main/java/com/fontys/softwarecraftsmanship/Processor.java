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
public class Processor extends Part {

    private double speed;
    
    public Processor(String title, double price, double speed) {
        super(title, price);
        this.speed = speed;
    }
    
}
