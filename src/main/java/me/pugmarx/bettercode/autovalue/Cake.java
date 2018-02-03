package me.pugmarx.bettercode.autovalue;


import com.google.auto.value.AutoValue;

/**
 * Demo of *Item 10* from EffectiveJava 3/E.
 * All objects must obey general contract when overriding <code>equals</code>. <code>AutoValue</code> from Google
 * saves the programmer from writing custom <code>equals</code> and <code>hashCode</code> implementations. IDEs can
 * generate implementations, but they're fragile -- and not future-proof. <code>AutoValue</code> annotation is a smarter
 * approach, therefore.
 */
@AutoValue
abstract class Cake {
    abstract int flour();
    abstract int bakingPowder();

    // Optional params
    abstract int eggs();
    abstract int icing();
    abstract int sugar();
    abstract int cocoa();
    abstract int oil();

    static Maker builder(int flourCups, int bakingPowderOz) {
        // return builder instance with defaults for non-required field
        return new AutoValue_Cake.Builder().flour(flourCups).bakingPowder(bakingPowderOz).oil(0).cocoa(0).icing(0)
                .sugar(0).eggs(0);
    }

    @AutoValue.Builder
    abstract static class Maker {
        abstract Maker flour(int flourCups);
        abstract Maker bakingPowder(int bakingPwdrOz);
        abstract Maker oil(int oilOz);
        abstract Maker cocoa(int cocoaMg);
        abstract Maker icing(int icingMg);
        abstract Maker sugar(int sugarMg);
        abstract Maker eggs(int eggCount);

        abstract Cake build();
    }
}