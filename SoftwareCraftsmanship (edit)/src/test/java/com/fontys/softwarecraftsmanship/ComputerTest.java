package com.fontys.softwarecraftsmanship;

import static org.junit.Assert.*;

/**
 *
 * @author 873955
 */
public class ComputerTest {

    /**
     * Test of AddPart method without parts, of class Computer.
     */
    @org.junit.Test
    public void testAddZeroParts() {
        Computer computer = new Computer();
        
        assertEquals(0, computer.NumberOfParts());
    }

    /**
     * Test of AddPart method with one part, of class Computer.
     */
    @org.junit.Test
    public void testAddOnePart() {
        Part p = new Part("", 0.0);
        Computer computer = new Computer();
        computer.AddPart(p);
        
        assertEquals(1, computer.NumberOfParts());
    }

    /**
     * Test of AddPart method with more parts, of class Computer.
     */
    @org.junit.Test
    public void testAddMoreParts() {
        final int PARTS_COUNT = 10;
        Computer computer = new Computer();
        
        for (int i = 0; i < PARTS_COUNT; i++) {
            assertEquals(i, computer.NumberOfParts());
            computer.AddPart(new Part("", 0.0));
        }
        
        assertEquals(PARTS_COUNT, computer.NumberOfParts());
    }

    /**
     * Test of AddPart method with a null reference part, of class Computer.
     */
    @org.junit.Test
    public void testAddNullPart() {
        Computer computer = new Computer();
        
        computer.AddPart(null);
        
        assertEquals(0, computer.NumberOfParts());
    }

    /**
     * Test of AddPart method with more null references as parts, of class Computer.
     */
    @org.junit.Test
    public void testAddNullParts() {
        final int PARTS_COUNT = 10;
        Computer computer = new Computer();
        
        for (int i = 0; i < PARTS_COUNT; i++) {
            computer.AddPart(null);
            assertEquals(0, computer.NumberOfParts());
        }
    }

    /**
     * Test of GetPrice method, of class Computer without any parts.
     */
    @org.junit.Test
    public void testGetEmptyComputerPrice() {
        Computer computer = new Computer();
        
        assertEquals(0.0, computer.GetPrice(), 0.0);
    }

    /**
     * Test of GetPrice method, of class Computer with one part.
     */
    @org.junit.Test
    public void testGetOnePartComputerPrice() {
        final double EXPECTED_PRICE = 10.0;
        Computer computer = new Computer();
        
        computer.AddPart(new Part("", 10.0));
        
        assertEquals(EXPECTED_PRICE, computer.GetPrice(), 0.0);
    }

    /**
     * Test of GetPrice method, of class Computer with more parts.
     */
    @org.junit.Test
    public void testGetMorePartsComputerPrice() {
        final int PARTS_COUNT = 10;
        final double PART_PRICE = 10.0;
        double expectedPrice = 0.0;
        Computer c = new Computer();
        
        for (int i = 0; i < PARTS_COUNT; i++) {
            c.AddPart(new Part("", PART_PRICE));
            expectedPrice += PART_PRICE;
        }
        
        assertEquals(expectedPrice, c.GetPrice(), 0.0);
    }

    /**
     * Test of IsComplete method of an empty Computer.
     */
    @org.junit.Test
    public void testEmptyComputerIsIncomplete() {
        Computer computer = new Computer();
        
        assertEquals(false, computer.IsComplete());
    }

    /**
     * Test of IsComplete method of a Computer with one part.
     */
    @org.junit.Test
    public void testOnePartComputerIsIncomplete() {
        Computer computer = new Computer();
        
        computer.AddPart(new Part("", 0.0));
        
        assertEquals(false, computer.IsComplete());
    }

    /**
     * Test of IsComplete method of a Computer with more parts, but not complete.
     */
    @org.junit.Test
    public void testMorePartsComputerIsIncomplete() {
        Computer computer = new Computer();
        
        computer.AddPart(new Part("", 0.0));
        computer.AddPart(new Part("", 0.0));
        computer.AddPart(new Part("", 0.0));
        computer.AddPart(new Part("", 0.0));
        computer.AddPart(new Part("", 0.0));
        
        assertEquals(false, computer.IsComplete());
    }

    /**
     * Test of IsComplete method of a complete Computer.
     */
    @org.junit.Test
    public void testComputerIsComplete() {
        Computer computer = new Computer();
        
        Casing casing = new Casing("", 0.0, "");
        Motherboard motherboard = new Motherboard("", 0.0);
        Processor processor = new Processor("", 0.0, 0.0);
        Memory memory = new Memory("", 0.0, "", 0);
        
        computer.AddPart(casing);
        computer.AddPart(processor);
        computer.AddPart(memory);
        computer.AddPart(motherboard);
        
        assertEquals(true, computer.IsComplete());
    }

    /**
     * Test of IsComplete method of an incomplete Computer.
     */
    @org.junit.Test
    public void testComputerIsIncomplete() {
        
        for (int i = 0; i < 4; i++) {
            Computer computer = new Computer();

            if (i != 0) {
                Casing casing = new Casing("", 0.0, "");
                computer.AddPart(casing);
            }
            if (i != 1) {
                Motherboard motherboard = new Motherboard("", 0.0);
                computer.AddPart(motherboard);
            }
            if (i != 2) {
                Processor processor = new Processor("", 0.0, 0.0);
                computer.AddPart(processor);
            }
            if (i != 3) {
                Memory memory = new Memory("", 0.0, "", 0);
                computer.AddPart(memory);
            }

            assertEquals(false, computer.IsComplete());
        }
    }
}
