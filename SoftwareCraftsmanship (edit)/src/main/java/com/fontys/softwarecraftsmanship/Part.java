package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final String title;
    private final double price;
    
    public Part(String title, double price) {
        this.title = title;
        this.price = price;
    }
   
    public double GetPrice() {
        return price;
    }
    
    
}
