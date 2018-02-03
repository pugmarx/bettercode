package me.pugmarx.bettercode.autovalue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CakeTest {

    @Test
    public void makeCakes() {

        // Build a cake without oil
        Cake cakeNoOil = Cake.builder(2, 3).flour(2).bakingPowder(3).sugar(2)
                .eggs(2).build();

        assertNotNull(cakeNoOil);

        // Check that it has 0 oil
        assertEquals(0, cakeNoOil.oil()); // default

        // Make cake with oil
        Cake cakeWOil = Cake.builder(2, 3).sugar(2).oil(1).eggs(2).build();

        // Obviously, both the cakes are different
        assertNotEquals(cakeNoOil, cakeWOil);

        // Another cake that's same as cake w/ oil
        Cake anotherCakeWOil = Cake.builder(2, 3).sugar(2).oil(1)
                .eggs(2).build();

        assertEquals(cakeWOil, anotherCakeWOil);
    }

}