package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartType type;
    private final String title;
    private final double price;
    private String subtype = null;
    private int size = -1;
    private double speed = -1.0;
    
    public Part(PartType type, String title, double price, String subtype, int size, double speed) {
        //this(type,title,price,subtype,size);
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
        this.speed = speed;
    }
    
    public Part(PartType type, String title, double price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    
    /*
    // Memory
    public Part(PartType type, String title, double price, String subtype, int size) {
        this(type,title,price,subtype);
        this.size = size;
    }
    
    // Casing
    public Part(PartType type, String title, double price, String subtype) {
        this(type,title,price);
        this.subtype = subtype;
    }
    
    // Processor
    public Part(PartType type, String title, double price, double speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.speed = speed;
    }
    
    // Motherboard
    public Part(PartType type, String title, double price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    */
    
    public PartType GetType() {
        return type;
    }
    
    public double GetPrice() {
        return price;
    }
}
