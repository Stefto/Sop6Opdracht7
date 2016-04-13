package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {

    List<Part> parts;

    public Computer(){
        parts = new ArrayList<>();
    }
    
    public Computer(List<Part> parts){
        this.parts = parts;
    }
    
    public int NumberOfParts() {
        return parts.size() - 1;
    }

    public void AddPart(Part p) {
        parts.add(p);
    }

    public double GetPrice() {
        double price = 0.0;

        for (Part part : parts) {
            price += part.GetPrice();
        }

        return price;
    }

    public boolean IsComplete() {
        boolean hasCasing = false;
        boolean hasProcessor = false;
        boolean hasMemory = false;
        boolean hasMotherboard = false;
        
        for (Part part : parts) {
            switch (part.GetType()) {
                case Casing:
                    hasCasing = true;
                    break;
                case Processor:
                    hasProcessor = true;
                    break;
                case Memory:
                    hasMemory = true;
                    break;
                case Motherboard:
                    hasMotherboard = true;
                    break;
                default:
                    break;
            }
        }
        
        return !(!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard);
    }
    
}
