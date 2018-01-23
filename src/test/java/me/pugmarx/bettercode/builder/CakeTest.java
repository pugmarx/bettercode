package me.pugmarx.bettercode.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CakeTest {

    @Test
    public void makeVegCake() {
        Cake cake = new Cake.Maker(2, 20).sugar(2).cocoa(3).oil(2).build();
        assertNotNull(cake);

    }

    @Test
    public void makeNonVegCake() {
        Cake cake = new Cake.Maker(2, 20).sugar(2).cocoa(3).oil(2)
                .eggs(2).build(); // contains egg!!
        assertNotNull(cake);
    }

}
