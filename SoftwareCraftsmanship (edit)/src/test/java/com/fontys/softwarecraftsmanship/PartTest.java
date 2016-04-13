package com.fontys.softwarecraftsmanship;

import static org.junit.Assert.*;
import java.util.*;

public class PartTest {
    
    /**
     * Test of GetPrice method.
     */
    @org.junit.Test
    public void testGetPrice() {
        final double DEFAULT_PRICE = 10.0;
        List<Part> parts = new ArrayList<>();
        
        Casing casing = new Casing("", DEFAULT_PRICE, "");
        Processor processor = new Processor("", DEFAULT_PRICE, 0.0);
        Memory memory = new Memory("", DEFAULT_PRICE, "", 0);
        Motherboard motherboard = new Motherboard("", DEFAULT_PRICE);
        
        parts.add(casing);
        parts.add(processor);
        parts.add(memory);
        parts.add(motherboard);
        
        
        for (Part part : parts) {
            assertEquals(DEFAULT_PRICE, part.GetPrice(), 0.0);
        }
    }
}
