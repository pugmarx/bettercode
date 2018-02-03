package me.pugmarx.bettercode.autovalue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CartItemTest {
    @Test
    public void create() throws Exception {
        CartItem item1 = CartItem.create(10,33, 12);
        CartItem item2 = CartItem.create(10,33, 12);

        assertEquals(item1, item2); // this would be true
    }
}