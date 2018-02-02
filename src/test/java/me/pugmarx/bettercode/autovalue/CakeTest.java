package me.pugmarx.bettercode.autovalue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CakeTest {

    @Test
    public void makeCakes() {
        Cake cakeNoOil = Cake.builder(2, 3).flour(2).bakingPowder(3).cocoa(5).sugar(2)
                .eggs(2).icing(1).build();
        assertNotNull(cakeNoOil);
        assertEquals(0, cakeNoOil.oil()); // default

        Cake cakeWOil = Cake.builder(2, 3).cocoa(5).sugar(2).oil(1).eggs(2).icing(1).build();

        assertNotEquals(cakeNoOil, cakeWOil);

        Cake anotherCakeWOil = Cake.builder(2, 3).cocoa(5).sugar(2).oil(1)
                .eggs(2).icing(1).build();

        assertEquals(cakeWOil, anotherCakeWOil);
    }

}