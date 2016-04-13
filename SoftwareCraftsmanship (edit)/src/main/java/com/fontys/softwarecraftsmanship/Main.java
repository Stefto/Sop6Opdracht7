package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer c = new Computer();
        
        Casing casing = new Casing(PartType.Casing, "Cooler Master Centurion 6", 49.50, "Midi tower");
        Processor processor = new Processor(PartType.Processor, "Intel i7-4790", 295.0, 3.6);
        Memory memory = new Memory(PartType.Memory, "G.SKILL Ripjaws X Series", 99.99, "DDR3", 16);
        Motherboard motherboard = new Motherboard(PartType.Motherboard, "MSI H97 PC MATE - Socket 1150 - ATX", 89.0);
        
        c.AddPart(casing);
        c.AddPart(processor);
        c.AddPart(memory);
        c.AddPart(motherboard);
        
        if (c.IsComplete()) {
            double price = c.GetPrice();
            System.out.println("Total price is EUR " + price);
        }
        else {
            System.out.println("Your computer is not ready yet...");
        }
    }
}
