package me.pugmarx.bettercode.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class CartItem {
    abstract int itemCode();

    abstract int quantity();

    abstract int price();

    static CartItem create(int itemCode, int quantity, int price) {
        return new AutoValue_CartItem(itemCode, quantity, price);
    }
}
