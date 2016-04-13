package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {

    List<Part> parts;
    private boolean hasCasing = false;
    private boolean hasProcessor = false;
    private boolean hasMemory = false;
    private boolean hasMotherboard = false;
    double price;

    public Computer() {
        parts = new ArrayList<>();
        price = 0.0;
    }

    public Computer(List<Part> parts) {
        this.parts = parts;
    }

    public int NumberOfParts() {
        return parts.size();
    }

    public void AddPart(Part part) {
        parts.add(part);
        price += part.GetPrice();
    }

    public double GetPrice() {
        return price;
    }

    public boolean IsComplete() {

        for (Part part : parts) {
            checkPart(part);
        }
        return !(!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard);
    }

    public void checkPart(Part part) {
        if (part instanceof Casing) {
            hasCasing = true;
        }

        if (part instanceof Processor) {
            hasProcessor = true;
        }

        if (part instanceof Memory) {
            hasMemory = true;
        }

        if (part instanceof Motherboard) {
            hasMotherboard = true;
        }
    }

}
