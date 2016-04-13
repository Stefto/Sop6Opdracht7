package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        Casing casing = new Casing("Cooler Master Centurion 6", 49.50, "Midi tower");
        Processor processor = new Processor("Intel i7-4790", 295.0, 3.6);
        Memory memory = new Memory("G.SKILL Ripjaws X Series", 99.99, "DDR3", 16);
        Motherboard motherboard = new Motherboard("MSI H97 PC MATE - Socket 1150 - ATX", 89.0);
        
        computer.AddPart(casing);
        computer.AddPart(processor);
        computer.AddPart(memory);
        computer.AddPart(motherboard);
        
        isComplete(computer);
    }
    
    public static void isComplete(Computer computer){
        if (computer.IsComplete()) {
            double price = computer.GetPrice();
            System.out.println("Total price is EUR " + price);
        }
        else {
            System.out.println("Your computer is not ready yet...");
        }
    }
}
