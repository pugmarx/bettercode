package me.pugmarx.bettercode.autovalue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CakeTest {

    @Test
    public void bakeACake() {
        Cake fruitCake = Cake.builder().flour(2).bakingPowder(3).cocoa(5).sugar(2).eggs(2).icing(1).build();
        assertNotNull(fruitCake);
        assertEquals(0, fruitCake.oil()); // default

        Cake fCake1 = Cake.builder().flour(2).bakingPowder(3).cocoa(5).sugar(2).oil(1).eggs(2).icing(1).build();

        assertNotEquals(fruitCake, fCake1);
        
    }

}